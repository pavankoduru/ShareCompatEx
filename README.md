# ShareCompatEx
This App will helpful to know about ShareCompat


This repository contains samples, starter code, and solutions for the
ShareComapt.

Introduction
------------

Extra helper functionality for sharing data between activities. ShareCompat provides functionality to extend the ACTION_SEND/ ACTION_SEND_MULTIPLE protocol and support retrieving more info about the activity that invoked a social sharing action. ShareCompat.IntentBuilder provides helper functions for constructing a sharing intent that always includes data about the calling activity and app. This lets the called activity provide attribution for the app that shared content. Constructing an intent this way can be done in a method-chaining style. To obtain an IntentBuilder with info about your calling activity, use the static method from(Activity). ShareCompat.IntentReader provides helper functions for parsing the defined extras within an ACTION_SEND or ACTION_SEND_MULTIPLE intent used to launch an activity. You can also obtain a Drawable for the caller's application icon and the application's localized label (the app's human-readable name).
Social apps that enable sharing content are encouraged to use this information to call out the app that the content was shared from.<br>
Reference:
```https://developer.android.com/reference/android/support/v4/app/ShareCompat```
