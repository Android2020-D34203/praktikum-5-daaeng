package com.example.praktikum_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView view1, view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        view1 = findViewById(R.id.userVIEW);
        view2 = findViewById(R.id.pass_VIEW);

        Intent i = getIntent();

        String username = getIntent().getExtras().getString("username");
        String password = getIntent().getExtras().getString("password");

        view1.setText("Username : " + username);
        view2.setText("Password : " + password);

    }
}