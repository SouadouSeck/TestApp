package com.example.app_tab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myapp.R;

public class MainActivity5 extends AppCompatActivity {

    private Button button;
    private ImageView appel;

    String[] IPAddresses = new String[10];
    int currentSize = 0;

    public void unsaveIP (String IP){
        IPAddresses[currentSize] = IP;
        currentSize++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void onBtnClick(View view) {
        EditText edtIpAddress = findViewById(R.id.edtIpAddress);
        unsaveIP(edtIpAddress.getText().toString());

        edtIpAddress.setText("Votre adresse IP est " + IPAddresses[0]);

        Intent otherActivity = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(otherActivity);
        finish();
    }
           /*this.button = (Button) findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener() {


        });*/

}