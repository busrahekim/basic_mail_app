package com.example.lab6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    private long messageId;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Messages message = Messages.messages[(int) messageId];
            EditText to = (EditText) view.findViewById(R.id.to);
            to.setText(message.getMail((int) messageId));
            EditText sbj = (EditText) view.findViewById(R.id.subject);
            sbj.setText(message.getSubTitle());
            EditText msg = (EditText) view.findViewById(R.id.msg);
            msg.setText( message.getDescription());

        }
    }

    public void setMessageID(long id) {
        this.messageId = id;
    }
}