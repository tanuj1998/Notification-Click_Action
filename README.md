# Notification-Click_Action

This application has two ways of sending notifications. Clicking on the notifications opens the specified activity in the app instead of just opening the main activity in the application. 

1. Notification using channels
2. FCM Push Notification

# Notification using channels
This type of notification is within the application and is handeled by notification channels.

USAGE
1. Download the zip folder and unzip all the files. Open the project in Android Studio.
2. Run the application

DEMO

App in Foreground mode

![fore](https://user-images.githubusercontent.com/24483619/59982426-0b2c6480-95c7-11e9-91c0-2e42ef7b433c.gif)

App in Background mode

![background](https://user-images.githubusercontent.com/24483619/59982271-56914380-95c4-11e9-9e9f-ec53cccfd8f8.gif)

App in Killed mode

![app](https://user-images.githubusercontent.com/24483619/59982388-63169b80-95c6-11e9-9ae6-806ffaff93b4.gif)

# FCM Push Notification

This type of notification is sent through firebase to all the users at once. To edit the "click_action" function which decides which activity to open, I have used Postmate.

USAGE
1. Download the zip folder and unzip all the files. Open the project in Android Studio.
2. Run the application.
3. Open Postmate and fill out all the fields as shown in the screenshots and click "Send" to send the push notification.

![header](https://user-images.githubusercontent.com/24483619/59982520-804c6980-95c8-11e9-922f-eb85bfa16390.png)
In the header, set "Content Type" as "application/json" and "Authorization" as your firebase Legacy Server Key. The key could be found in project settings under "Cloud Messaging" tab in firebase console.

![body](https://user-images.githubusercontent.com/24483619/59982496-3f545500-95c8-11e9-862d-f8e102dc98b4.png)
In the body, set "to" to your topic specified in the main activity. For example, I have specified it as "NEWS".

DEMO

![fcm](https://user-images.githubusercontent.com/24483619/59982638-5dbb5000-95ca-11e9-9621-4ab62d202dfd.gif)

This method works when app is in foreground mode, background mode and kill mode.

# Version

1.0.0

# Credits
. Postman (https://www.getpostman.com/)

. Firebase Cloud Messaging (https://firebase.google.com/docs/cloud-messaging)

. Kapwing Video Trimmer (https://www.kapwing.com/trim-video)
