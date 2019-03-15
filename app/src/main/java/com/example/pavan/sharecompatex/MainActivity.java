package com.example.pavan.sharecompatex;

import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        ShareCompat.IntentBuilder.from(this).setChooserTitle("Learn how to share").setType("text/plain").setText("TextToShare").startChooser();
    }
}
