package com.example.kunal.mytravelapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kunal on 25-03-2017.
 This is our own custom constructor (it doesn't mirror a superclass constructor).
        * The context is used to inflate the layout file, and the list is the data we want
        * to populate into the lists.
*/

class AndroidPlaceAdapter extends ArrayAdapter<Places>{

    public AndroidPlaceAdapter(Activity mactivity, ArrayList<Places> mplace) {
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(mactivity,0,mplace);
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView=convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Places currentPlace= getItem(position);
        TextView plceNme=(TextView)listItemView.findViewById(R.id.text);
        plceNme.setText(currentPlace.getPlace_Name());
        ImageView icnView=(ImageView)listItemView.findViewById(R.id.img);
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            icnView.setImageResource(currentPlace.getPlaceImageid());
            // Make sure the view is visible
            icnView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            icnView.setVisibility(View.GONE);
        }




        return listItemView;
    }
}
