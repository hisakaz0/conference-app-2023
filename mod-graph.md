### Dependency Diagram

```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR

  subgraph core
    common
    data
    designsystem
    model
    testing
  end
  subgraph feature
    about
    achievements
    contributors
    floor-map
    main
    sessions
    sponsors
    staff
  end
  main --> designsystem
  main --> ui
  main --> model
  main --> testing
  app-ios-shared --> model
  app-ios-shared --> data
  app-ios-shared --> ui
  app-ios-shared --> contributors
  sessions --> designsystem
  sessions --> ui
  sessions --> model
  sessions --> testing
  sponsors --> designsystem
  sponsors --> ui
  sponsors --> model
  sponsors --> testing
  achievements --> designsystem
  achievements --> ui
  achievements --> model
  achievements --> testing
  testing --> model
  testing --> designsystem
  testing --> data
  testing --> main
  testing --> sessions
  testing --> about
  testing --> sponsors
  testing --> floor-map
  testing --> achievements
  testing --> staff
  data --> model
  data --> common
  about --> designsystem
  about --> ui
  about --> model
  about --> testing
  contributors --> model
  contributors --> ui
  contributors --> designsystem
  ui --> common
  ui --> designsystem
  ui --> data
  staff --> designsystem
  staff --> ui
  staff --> model
  staff --> testing
  floor-map --> designsystem
  floor-map --> ui
  floor-map --> model
  floor-map --> testing
  app-android --> main
  app-android --> contributors
  app-android --> sessions
  app-android --> about
  app-android --> sponsors
  app-android --> floor-map
  app-android --> achievements
  app-android --> staff
  app-android --> model
  app-android --> data
  app-android --> designsystem
  app-android --> ui
  app-android --> app-ios-shared
  app-android --> core
  app-android --> feature
  app-android --> common
  app-android --> testing
```