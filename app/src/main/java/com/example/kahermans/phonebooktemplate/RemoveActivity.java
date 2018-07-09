package com.example.kahermans.phonebooktemplate;
// Introducing Google Firebase: A Free Database for your Mobile Apps
// CSTA 2018 Kimberly Hermans
// Remove Activity: User searches for contact and selects one to remove from database
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class RemoveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);
    }

    public void refresh(String update) {

    }

    public void removeRecord(View view) {

    }

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
