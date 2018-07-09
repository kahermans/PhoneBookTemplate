package com.example.kahermans.phonebooktemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addContact( View view)
    {
        Intent intent = new Intent( this, com.example.kahermans.phonebooktemplate.AddActivity.class);
        startActivity(intent);
    }

    public void viewContacts(View view)
    {
        Intent intent = new Intent(this, com.example.kahermans.phonebooktemplate.ViewActivity.class);
        startActivity( intent );
    }

    public void searchContacts(View view)
    {
        Intent intent = new Intent(this, com.example.kahermans.phonebooktemplate.SearchActivity.class);
        startActivity( intent );
    }

    public void removeContact(View view )
    {
        Intent intent = new Intent(this, com.example.kahermans.phonebooktemplate.RemoveActivity.class);
        startActivity( intent);
    }

    public void updateContact(View view )
    {
        Intent intent = new Intent( this, com.example.kahermans.phonebooktemplate.UpdateActivity.class);
        startActivity(intent);
    }
}
