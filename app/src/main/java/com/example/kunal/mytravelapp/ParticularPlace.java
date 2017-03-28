package com.example.kunal.mytravelapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParticularPlace extends AppCompatActivity {
    static String plcName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particular_place);
        Bundle plces=getIntent().getExtras();
        ParticularPlace.plcName=plces.getString("plName");

//        TextView tv=(TextView)findViewById(R.id.tv);
//        tv.setText(plcName);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        Placeadapter adapter = new Placeadapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
    public String getSelectedPlaceName(){
        return plcName;
    }
}
