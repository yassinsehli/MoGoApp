package com.example.mogo_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginMenu extends AppCompatActivity {
    Button register;
    Button login;
    EditText emailTxt;
    EditText password_Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmenu);

        // Variable's association :
        emailTxt = findViewById(R.id.emailtxt);
        password_Txt = findViewById(R.id.pswdtxt);
        login = findViewById(R.id.loginbtnid);
        register = findViewById(R.id.registerId);

        // Methods :
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if user do not fill all the blanks --> ERROR
                if (emailTxt.getText().toString().equals("") || (password_Txt.getText().toString().equals("")))
                    Toast.makeText(LoginMenu.this, "ERROR, PLEASE ENTER YOUR EMAIL AND PASSWORD !", Toast.LENGTH_SHORT).show();
                else {
                    //Treatment...Comparing data base with entered data by user  (TO COMPLETE) User exists ? OK.
                    //Intent to Main activity + packaging data to the main activity with intents (explicit)
                    String userName = emailTxt.getText().toString().substring(0, emailTxt.getText().toString().lastIndexOf("@")); //Extracting username from email addresse
                    //substring method that gets all characters before "@" --> LastIndexOf
                    Intent i_ToMain = new Intent(LoginMenu.this, MainMenu.class);
                    i_ToMain.putExtra("key", userName);
                    startActivity(i_ToMain);
                }
            }
        });

        //Registering New User Case :
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_ToRegistration = new Intent(LoginMenu.this, SignUpMenu.class);
                startActivity(i_ToRegistration);
            }
        });
    }
}