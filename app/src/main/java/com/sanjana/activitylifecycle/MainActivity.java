package com.sanjana.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    //first default lifecycle activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        Log.i("MainActivity", "onCreate() invoked");
        tv.append("onCreate()\n");
        Toast.makeText(this, "App is created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart() invoked");
        tv.append("onStart()\n");
        Toast.makeText(this, "App is started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume() invoked");
        tv.append("onResume()\n");
        Toast.makeText(this, "App is resumed", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause() invoked");
        tv.append("onPause()\n");
        Toast.makeText(this, "App is paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop() invoked");
        tv.append("onStop()\n");
        Toast.makeText(this, "App is stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy() invoked");
        tv.append("onDestroy()\n");
        Toast.makeText(this, "App is destroyed", Toast.LENGTH_SHORT).show();
    }
}