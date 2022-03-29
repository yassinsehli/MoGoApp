package com.example.mogo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginMenu extends AppCompatActivity {
    Button signup;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmenu);

        //intents and buttons of LOGIN MENU
        //signup = findViewById(R.id.signupid);
        //signup.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent i1 = new Intent(LoginMenu.this, SignUpMenu.class);
                //startActivity(i1);
           // }
        //});
        login = findViewById(R.id.loginbtnid);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(LoginMenu.this, MainMenu.class);
                startActivity(i2);
            }
        });
    }
}