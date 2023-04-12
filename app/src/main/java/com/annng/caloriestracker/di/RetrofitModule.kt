package com.annng.caloriestracker.di

import android.content.Context
import com.annng.caloriestracker.data.remote.CaloriesApi
import com.annng.caloriestracker.data.repository.CaloriesRepositoryImpl
import com.annng.caloriestracker.domain.repository.CaloriesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.CacheControl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import org.conscrypt.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(appContext : Context) = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(getInterceptor(appContext))
            .addInterceptor(loggingInterceptor)
            .build()
    } else {
        OkHttpClient
            .Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideApi(@ApplicationContext context: Context): CaloriesApi {
        return Retrofit.Builder()
            .baseUrl("YOUR_URL_HERE")
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkHttpClient(context))
            .build()
            .create(CaloriesApi::class.java)
    }

    @Provides
    @Singleton
    fun getInterceptor(context: Context): Interceptor {
        return Interceptor { chain: Interceptor.Chain ->
            val request: Request = chain.request().newBuilder()
                .header("Authorization", "Bearer YOUR_TOKEN")
                .cacheControl(CacheControl.Builder().noCache().build())
                .build()
            chain.proceed(request)
        }
    }

    @Provides
    @Singleton
    fun provideGitRepository(api: CaloriesApi): CaloriesRepository {
        return CaloriesRepositoryImpl(api = api)
    }
}