package com.example.vijay.realplay;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Camera camera;
    FrameLayout frameLayout;
    showCamera showcamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=findViewById(R.id.frameLayout);

        camera=Camera.open();
        showcamera=new showCamera(this,camera);
        frameLayout.addView(showcamera);
        getSupportActionBar().hide();
    }
}
