package com.example.kunal.mytravelapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kunal on 29-03-2017.
 */

public class InsidePlaceAdapter extends ArrayAdapter<InsidePlace> {
    public InsidePlaceAdapter(Context context, ArrayList<InsidePlace> iplace) {
        super(context, 0, iplace);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.inside_place_list_item, parent, false);
        }
        int x=position;
        InsidePlace inPlce=getItem(position);
//        String kj=inPlce.getInsideName();
        TextView tv2=(TextView)listItemView.findViewById(R.id.plDesc);
        tv2.setText(inPlce.getDescription());

        TextView tv1=(TextView)listItemView.findViewById(R.id.plName);
//        String kkk= (String) tv1.getText();

        tv1.setText(inPlce.getInsideName());
        return listItemView;
    }
}
