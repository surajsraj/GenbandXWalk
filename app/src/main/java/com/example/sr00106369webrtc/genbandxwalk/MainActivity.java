package com.example.sr00106369webrtc.genbandxwalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);
        xWalkWebView.clearCache(true);
        xWalkWebView.load("https://sg1.genband.com/smartoffice/", null);
// turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }

    @Override
    protected void onPause() {
        super.onPause();
//        if (xWalkWebView != null) {
//            xWalkWebView.pauseTimers();
//            xWalkWebView.onHide();
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        if (xWalkWebView != null) {
//            xWalkWebView.resumeTimers();
//            xWalkWebView.onShow();
//        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (xWalkWebView != null) {
            xWalkWebView.onDestroy();
        }
    }
}
