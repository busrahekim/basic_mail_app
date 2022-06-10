package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGES_ID = "id";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = findViewById(R.id.button);

        SecondFragment frag = (SecondFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int messageId = (int) getIntent().getExtras().get(EXTRA_MESSAGES_ID);
        frag.setMessageID(messageId);
    }

    public void reply(View view) {
        EditText messageView = findViewById(R.id.msg);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        startActivity(intent);
    }
}