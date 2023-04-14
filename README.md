# Calories-Compose

Calories Tracker is UI-Kit from [Calories Tracker Mobile](https://uikit.to/calories-tracker-mobile-app/)

## Getting Started
| Home | Drawer Menu |
|-------- | -----------|
| <img src="https://user-images.githubusercontent.com/31025016/231973021-467200c0-1ceb-47f7-b191-b1f12968c0cc.png" alt= “” width="300px"> | <img src="https://user-images.githubusercontent.com/31025016/231973194-07b3c24c-ec3f-4023-8a92-c4f3660e4f44.png" alt= “” width="300px"> |

| List Food | Filter |
|-------- | -----------|
| <img src="https://user-images.githubusercontent.com/31025016/231973380-4d3a01e7-b60b-4d8b-8703-4bb87a5914ea.png" alt= “” width="300px"> | <img src="https://user-images.githubusercontent.com/31025016/231973496-e8dbfb49-f499-4a0f-96e7-d444aff5124a.png" alt= “” width="300px"> |

| Detail Food | 
|------------ |
| <img src="https://user-images.githubusercontent.com/31025016/231973740-189f14e2-dfd2-411b-be9c-72fb155bd31b.png" alt= “” width="300px"> |

```
|-- common                                # Directory for Shared Class (Reusable purpose)
|   `-- util
|       `-- ext
|-- data                                  # Directory for Retrieve API purpose
|   |-- remote                            # Endpoint from Retrofit Service
|   `-- repository                        
|-- di                                    # Directory for Dependency Injection Class
|-- domain                                # Directory for mapping data purpose
|   |-- model
|   |-- repository
|   `-- usecase
|-- feature                               # Directory for Screen / Page
|   `-- presentation
|       |-- categories                    # screen / page directory (Screen, ViewModel, State)
|       |   `-- component                 # Directory of piece of your screen / page component
|       |-- home
|       |   `-- component
|       `-- product
|           |-- detail
|           |   `-- component
|           `-- list
|               `-- component
`-- ui
    |-- theme
    `-- widget                             # Directory for reusable component (atom, molecule)
    
```
