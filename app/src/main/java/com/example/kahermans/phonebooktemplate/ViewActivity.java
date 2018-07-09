package com.example.kahermans.phonebooktemplate;
// Introducing Google Firebase: A Free Database for your Mobile Apps
// CSTA 2018 Kimberly Hermans
// View Activity - Displays all the records of the database in the order it appears

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


    }

    public void goHome(View view)
    {
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }
}