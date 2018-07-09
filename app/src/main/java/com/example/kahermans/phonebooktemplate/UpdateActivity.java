package com.example.kahermans.phonebooktemplate;
// Introducing Google Firebase: A Free Database for your Mobile Apps
// CSTA 2018 Kimberly Hermans
// Update Activity - Updates the phone number of a contact

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

    }

    // Clears the listAdapter and rebuilds it from contactList
    public void refresh(String update)
    {

    }
    public void updateContact(View view) {

    }

    public void goHome(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity( intent);
    }
}
