package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class SquawkFirebaseInstanceIdService extends FirebaseMessagingService{

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();
    @Override
    public void onNewToken(String token) {
        Log.d(LOG_TAG, "Refreshed token: " + token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // FCM registration token to your app server.
        sendRegistrationToServer(token);
    }
    private void sendRegistrationToServer(String token) {
        // This method is blank, but if you were to build a server that stores users token
        // information, this is where you'd send the token to the server.
    }
}
