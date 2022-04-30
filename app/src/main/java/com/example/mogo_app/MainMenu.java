package com.example.mogo_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    EditText task1, task2, task3, task4;
    EditText mainTask;
    Button logout;
    ImageView profilePic;
    TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        // Variable's association :
        task1 = findViewById(R.id.task1id);
        task2 = findViewById(R.id.task2id);
        task3 = findViewById(R.id.task3id);
        task4 = findViewById(R.id.task4id);
        mainTask = findViewById(R.id.mainfocustxtid);
        profilePic = findViewById(R.id.profilepicid);
        userName = findViewById(R.id.nameId);

        // methods :
        // User name import from LoginMenu
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String info_1_NAME = extras.getString("key");
            showInfo(userName, info_1_NAME);
        }

        // User adding tasks case

        // Checkbox checked ? --> cross task

        // User changing his profile picture case

        // Last time in method

        // Time Spent method

        // User wants to log out case
        logout = findViewById(R.id.logOut);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_ToLogInMenu = new Intent(MainMenu.this, LoginMenu.class);
                startActivity(i_ToLogInMenu);
            }
        });
    }
    public void showInfo( TextView userName_0, String Transmitted_data) {
        userName_0.setText(Transmitted_data);
    }
}