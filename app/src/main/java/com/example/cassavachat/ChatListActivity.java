package com.example.cassavachat;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ChatListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupChatList();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setupChatList(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ChatListAdapter adapter = new ChatListAdapter(getChatList());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private List<Chat> getChatList(){
        return Arrays.asList(new Chat("Cesias Chirebvu","0778075043"),
                             new Chat("Bob Marley","0777222972"),
                             new Chat("Mike Tyson","0777222972"),
                             new Chat("Connor Mcgregor","0777222972"),
                             new Chat("Big Shaw","0777222972"),
                            new Chat("Cesias Chirebvu","0778075043"),
                            new Chat("Bob Marley","0777222972"),
                            new Chat("Mike Tyson","0777222972"),
                            new Chat("Connor Mcgregor","0777222972"),
                            new Chat("Big Shaw","0777222972")
                );
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