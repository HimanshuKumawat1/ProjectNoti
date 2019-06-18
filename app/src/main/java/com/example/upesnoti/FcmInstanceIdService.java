package com.example.upesnoti;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FcmInstanceIdService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String fcm_token) {
        super.onNewToken(fcm_token);
        Log.d("NEW_TOKEN",fcm_token);

    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }
}
