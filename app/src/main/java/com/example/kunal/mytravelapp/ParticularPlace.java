package com.example.kunal.mytravelapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TableLayout;
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
        Placeadapter adapter = new Placeadapter(this,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
            tabLayout.setupWithViewPager(viewPager);
    }
    public String getSelectedPlaceName(){
        return plcName;
    }
}
