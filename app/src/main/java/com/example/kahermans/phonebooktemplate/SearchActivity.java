package com.example.kahermans.phonebooktemplate;
// Introducing Google Firebase: A Free Database for your Mobile Apps
// CSTA 2018 Kimberly Hermans
// Search Activity - Searches the database for a contact name and returns all matching results

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }

    public void search(View view)
    {

    }

    public void goHome( View view )
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity( intent);
    }
}
