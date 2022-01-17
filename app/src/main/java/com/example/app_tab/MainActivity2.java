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

public class MainActivity2 extends AppCompatActivity {

    private Button buttonRegister;
    private Button buttonUnregister;
    private ImageView appel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        this.buttonRegister= (Button) findViewById(R.id.button);
        this.buttonUnregister= (Button) findViewById(R.id.button2);

        buttonRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherActivity = new Intent (getApplicationContext(), MainActivity3.class);
                startActivity(otherActivity);
                finish();
            };
        });

        buttonUnregister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherActivity = new Intent (getApplicationContext(), MainActivity5.class);
                startActivity(otherActivity);
                finish();
            };
        });

        this.appel = (ImageView) findViewById(R.id.appeler);
        appel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherActivity1 = new Intent (getApplicationContext(), MainActivity4.class);
                startActivity(otherActivity1);
                finish();
            };
        });
    }
}