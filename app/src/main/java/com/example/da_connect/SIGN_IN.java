package com.example.da_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SIGN_IN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void GoToSignUpPage(View v){
//        Toast.makeText(this, "going to signup page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SIGN_UP.class);
        startActivity(intent);
    }
}