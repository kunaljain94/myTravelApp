package com.example.kunal.mytravelapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InsidePlacesFragment extends Fragment {


    public InsidePlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        String str=(String)savedInstanceState.get("plcNaame");
        ParticularPlace pp=new ParticularPlace();
        String selectedPlace=pp.getSelectedPlaceName();
//        TextView textView = new TextView(getActivity());
//        textView.setText(selectedPlace);
        View rootView = inflater.inflate(R.layout.travel_list, container, false);
        ArrayList<InsidePlace> insideplce = new ArrayList<InsidePlace>();
        if(selectedPlace.equalsIgnoreCase("Delhi")) {


            insideplce.add(new InsidePlace("Jantar Marntar","Located in rear part of delhi. Built in 1883" +
                    "One of a love spot in Delhi. People used to come here to feel love with each othr "));
            insideplce.add(new InsidePlace("India Gate", "Located in ctentre of delhi built keeping" +
                    "in memory of soldies who died for our country India"));
            insideplce.add(new InsidePlace("Qutub Minar","Built by shah Jahan. Was one tallest monument in delhi" +
                    "Now has became a picnic spot for families and schools"));

        }
        else {
            insideplce.add(new InsidePlace("Sector 17","Located in rear part of delhi. Built in 1883" +
                    "One of a love spot in Delhi. People used to come here to feel love with each othr "));
            insideplce.add(new InsidePlace("Sector 7 Panchkula", "Located in ctentre of delhi built keeping" +
                    "in memory of soldies who died for our country India"));


        }
        InsidePlaceAdapter insidePlaceAdapter=new InsidePlaceAdapter(getActivity(),insideplce);
        ListView lv=(ListView)rootView.findViewById(R.id.list);
        lv.setAdapter(insidePlaceAdapter);



        return rootView;
    }

}
