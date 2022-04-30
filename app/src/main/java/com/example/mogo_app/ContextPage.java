package com.example.mogo_app;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class ContextPage extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextpage);

        // Variable's association :
        next = findViewById(R.id.idbtn);

        //Methods :
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(ContextPage.this,LoginMenu.class);
                startActivity(i1);
            }
        });
    }
}

