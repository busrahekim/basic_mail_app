package com.example.lab6;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyAdapter extends ArrayAdapter<String> {

    Context context;
    Fragment fragment;
    Messages[] messages ;
    
    public MyAdapter(Context context, Messages[] messages) {
        super(context,R.layout.list_item);
        this.context = context;
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.length;
    }

    private class ViewHolder {
        TextView titleView;
        TextView subTitleView;
        TextView desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item,parent,false);
            viewHolder.titleView = convertView.findViewById(R.id.titleView);
            viewHolder.subTitleView = convertView.findViewById(R.id.subTitleView);
            viewHolder.desc = convertView.findViewById(R.id.desc);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.titleView.setText( messages[position].getTitle());
        viewHolder.subTitleView.setText(messages[position].getSubTitle());

        String sumDesc = messages[position].getDescription().substring(0,34) +"...";
        viewHolder.desc.setText(sumDesc);

        return convertView;
    }

}
