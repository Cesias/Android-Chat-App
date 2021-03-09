package com.example.cassavachat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RecyclerView rvContacts = findViewById(R.id.rvContacts);
//
//        ArrayList<String> contacts = new ArrayList<>();
//        contacts.add("Horse");
//        contacts.add("Cow");
//        contacts.add("Camel");
//        contacts.add("Sheep");
//        contacts.add("Goat");
//
//
//        // Create adapter passing in the sample user data
//        ChatListAdapter adapter = new ChatListAdapter(contacts);
//        // Attach the adapter to the recyclerview to populate items
//        rvContacts.setAdapter(adapter);
//        // Set layout manager to position the items
//        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        // That's all!

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.new_folder:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "You pressed new folder icon",
                                Toast.LENGTH_SHORT)
                        .show();
                return true;

            case R.id.help:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "You pressed help icon",
                                Toast.LENGTH_SHORT)
                        .show();
                //startActivity(i2);
                return (true);


            case R.id.info:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "You pressed info option",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.exit:
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

}