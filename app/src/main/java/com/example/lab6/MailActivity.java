package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MailActivity extends AppCompatActivity {

    ListView listView;
    Messages[] messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        listView = findViewById(R.id.mailList);
        messages = Messages.messages;

        MyAdapter myAdapter = new MyAdapter(MailActivity.this,messages);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MailActivity.this, DetailActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);
            }
        });
    }

}