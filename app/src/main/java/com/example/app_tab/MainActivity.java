package com.example.app_tab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle
import android.os.Handler;

import com.example.myapp.R;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH__SCREEN_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Placement du design
        setContentView(R.layout.activity_main);

        //List of instructions

        //Redirection vers la page principale mainactivity après 5 secondes

        //Handler post delayed
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Start a page
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH__SCREEN_TIMEOUT);
    }
}
