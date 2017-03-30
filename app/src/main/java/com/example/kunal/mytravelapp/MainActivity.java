package com.example.kunal.mytravelapp;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        CollapsingToolbarLayout collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
//        collapsingToolbarLayout.setTitle("Travel App");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ArrayList<Places> place=new ArrayList<Places>();
//        place.add(new Places("Delhi",R.drawable.delhi));
//        place.add(new Places("Chandigarh",R.drawable.chandigarh));
//        place.add(new Places("Mysore",R.drawable.mysore));
//        place.add(new Places("Agra",R.drawable.agra));

        place.add(new Places("Delhi"));
        place.add(new Places("Chandigarh"));
        place.add(new Places("Mysore"));
        place.add(new Places("Agra"));

        AndroidPlaceAdapter placeAdapter=new AndroidPlaceAdapter(this,place);
        GridView gridView=(GridView)findViewById(R.id.grid);
        gridView.setAdapter(placeAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Places plc=place.get(position);

                Toast.makeText(MainActivity.this,plc.getPlace_Name(),Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,ParticularPlace.class);

                i.putExtra("plName",plc.getPlace_Name());
                startActivity(i);

            }
        });
    }
}
