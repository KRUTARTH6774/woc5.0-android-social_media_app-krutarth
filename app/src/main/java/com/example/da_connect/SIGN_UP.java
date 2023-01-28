package com.example.da_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SIGN_UP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void GoToSignInPage(View v){
//        Toast.makeText(this, "Going to SignIN page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SIGN_IN.class);
        startActivity(intent);
    }
}