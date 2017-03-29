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
            insideplce.add(new InsidePlace("Red Fort","Again Built by shah Jahan. Red in color. Now almost ruined by the" +
                    "regular tourists who destroyed the quality of this place my making this place dirty"));
            insideplce.add(new InsidePlace("Indraprstha","park situated near Mayur Vihar. A good picnic spot to go."));

        }
        else if (selectedPlace.equalsIgnoreCase("Chandigarh")){
            insideplce.add(new InsidePlace("Sector 17","Located in rear part of delhi. Built in 1883" +
                    "One of a love spot in Delhi. People used to come here to feel love with each othr "));
            insideplce.add(new InsidePlace("Sector 7 Panchkula", "Located in ctentre of delhi built keeping" +
                    "in memory of soldies who died for our country India"));
            insideplce.add(new InsidePlace("Rose Garden","A beutiful place to go with your girlfriend and have have photoshoot"));


        }
        else if (selectedPlace.equalsIgnoreCase("agra")){
            insideplce.add(new InsidePlace("Taj Mahal","Its 1 of the seven wonders of the world and is self explainatory"));
        }
        else {
            insideplce.add(new InsidePlace("Infosys Mysore","Multiplex, Bowling AAlley, ECCs and everything else makes " +
                    "a life of an engineer so funloving"));
        }
        InsidePlaceAdapter insidePlaceAdapter=new InsidePlaceAdapter(getActivity(),insideplce);
        ListView lv=(ListView)rootView.findViewById(R.id.list);
        lv.setAdapter(insidePlaceAdapter);



        return rootView;
    }

}
