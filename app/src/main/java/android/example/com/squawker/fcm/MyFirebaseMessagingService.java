package android.example.com.squawker.fcm;

import android.app.Service;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String TAG = MyFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e(TAG,"The token string is "  + s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }
}
