package com.example.app_tab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

import com.example.myapp.R;

public class MainActivity4 extends AppCompatActivity {

    private ImageView imageView3;
    private ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);

        this.imageView3= (ImageView) findViewById(R.id.mainslibres);
        this.imageView4= (ImageView) findViewById(R.id.raccrocher);

        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            };
        });

        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherActivity = new Intent (getApplicationContext(), MainActivity2.class);
                startActivity(otherActivity);
                finish();
            };
        });

    }
}