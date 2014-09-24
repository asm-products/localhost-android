package com.localhost.localhost;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.facebook.*;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onAuthButtonClicked(View view) {
        // Facebook login
        Session.openActiveSession(this, true, new Session.StatusCallback() {
            @Override
            public void call(Session session, SessionState state, Exception exception) {
                if (session.isOpened()) {
                    android.util.Log.d("access_token", session.getAccessToken());
                }
            }
        });
    }
}
