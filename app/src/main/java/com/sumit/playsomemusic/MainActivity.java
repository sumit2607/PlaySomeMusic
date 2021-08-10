package com.sumit.playsomemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mbutton , mbutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = findViewById(R.id.button);
        mbutton2 = findViewById(R.id.button2);
        mbutton.setOnClickListener(this);
        mbutton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mbutton){
            startService(new Intent(this, MyService.class));
        }else if(view== mbutton2){
            stopService(new Intent(this, MyService.class));

        }
    }
}