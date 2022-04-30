package com.example.mogo_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpMenu extends AppCompatActivity {
    EditText name, email, password, password_2;
    Button Register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupmenu);

        // Variable's association :
        name = findViewById(R.id.nameid);
        email = findViewById(R.id.emailid);
        password = findViewById(R.id.pswrd1);
        password_2 = findViewById(R.id.pswrd2);
        Register = findViewById(R.id.registerid);
        login = findViewById(R.id.loginid);

        //Methods :
        //Treatment...Adding user's data to data base (TO COMPLETE)
        //Intent to Main activity + packaging data to the main activity
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if user do not fill all the blanks --> ERROR
                // if password & password _Confirmation do not correspond --> ERROR
                if (name.getText().toString().equals("") || (email.getText().toString().equals(""))
                        || (password.getText().toString().equals("")) || !(password.getText().toString().equals(password_2.getText().toString())))
                {
                    Toast.makeText(SignUpMenu.this, "PLEASE ENTER LEGIBLE DATA !", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i_ToMain = new Intent(SignUpMenu.this, MainMenu.class);
                    String userName = name.getText().toString(); // Converting user's name to a string
                    i_ToMain.putExtra("key", userName);  //putExtra only eats up string values
                    startActivity(i_ToMain);
                }
                                            }
                                                            });

        // User have an account case :
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_ToLoginMenu = new Intent(SignUpMenu.this, LoginMenu.class);
                startActivity(i_ToLoginMenu);
            }

        });
    }
}