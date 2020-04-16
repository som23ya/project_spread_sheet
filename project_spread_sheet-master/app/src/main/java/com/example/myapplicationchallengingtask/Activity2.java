package com.example.myapplicationchallengingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;import android.widget.TextView;

import static com.example.myapplicationchallengingtask.R.layout.activity_main2;

public class Activity2 extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);
        button1 = (Button)findViewById(R.id.b1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Creating explicit intent
                Intent i = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}