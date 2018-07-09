package com.example.kahermans.phonebooktemplate;

// Introducing Google Firebase: A Free Database for your Mobile Apps
// CSTA 2018 Kimberly Hermans
// Add Activity - Allows users to add contacts to the phone book

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kahermans.phonebooktemplate.MainActivity;
import com.example.kahermans.phonebooktemplate.R;

public class AddActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addContact(View view)
    {

    }

    public void goHome( View view )
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity( intent);
    }
}
