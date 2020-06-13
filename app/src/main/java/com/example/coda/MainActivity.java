package com.example.coda;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        TextView titleText = (TextView) findViewById(R.id.title_text);
        titleText.setText(getString(R.string.app_name));
    }
}