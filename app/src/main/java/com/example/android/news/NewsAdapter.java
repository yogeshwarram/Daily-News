package com.example.android.news;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter {

    public NewsAdapter(Activity context, ArrayList<News> news){
        super(context, 0, news);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        News currentNews=(News) getItem(position);

        TextView titleTextView=(TextView)listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getTitleName());

        TextView sectionTextView=(TextView)listItemView.findViewById(R.id.section);
        sectionTextView.setText(currentNews.getSectionName());


        return listItemView;
    }
}

