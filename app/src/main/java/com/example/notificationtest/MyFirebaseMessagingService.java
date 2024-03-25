package com.example.notificationtest;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM", "New token: " + token);
        //token을 서버로 전송
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        //수신한 메시지를 처리
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification != null) {
            Log.d("FCM", "Message Notification Title: " + notification.getTitle());
            Log.d("FCM", "Message Notification Body: " + notification.getBody());
        }
    }
}
