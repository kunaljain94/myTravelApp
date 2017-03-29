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
public class InsideFoodFragment extends Fragment {


    public InsideFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText("Inside Food Fragment");
        ParticularPlace pp=new ParticularPlace();
        String selectedPlace=pp.getSelectedPlaceName();
        View rootView = inflater.inflate(R.layout.travel_list, container, false);
        ArrayList<InsidePlace> insideplce = new ArrayList<InsidePlace>();
        if(selectedPlace.equalsIgnoreCase("Delhi")) {


            insideplce.add(new InsidePlace("Momos","Althoghnot a dish of delhi stilll in some places this dish is much better " +
                    "compared to the original place from where it belongs"));
            insideplce.add(new InsidePlace("Gol gappe", "Filled with sweet and sour water and some choles. One of the favorite dish of" +
                    "delhights"));
            insideplce.add(new InsidePlace("Parathe","Differebt Parathes like Alooo and gobhi. Best parathes can be found" +
                    "in Chandnichowk"));
            insideplce.add(new InsidePlace("Chilli Potato","For people who like spicy food. A plce to be"));

        }
        else if (selectedPlace.equalsIgnoreCase("Chandigarh")){
            insideplce.add(new InsidePlace("Lassi","Sweet lassi is the thing for which chandigarh is famous for." +
                    "The tickness of this lassi is not comparable in any part of India "));
            insideplce.add(new InsidePlace("Chicken", "Butter Chicken of chandigarh is so much filled with butter that" +
                    "you can feel like you are directly having butter. Pal dabha is famous for it"));



        }
        else if (selectedPlace.equalsIgnoreCase("agra")){
            insideplce.add(new InsidePlace("Pedha","Different pedha like chocolate pedha , Cookie pedha is there"));
        }
        else {
            insideplce.add(new InsidePlace("Infosys Mysore Food","Several dishes from all over India"));
        }
        InsidePlaceAdapter insidePlaceAdapter=new InsidePlaceAdapter(getActivity(),insideplce);
        ListView lv=(ListView)rootView.findViewById(R.id.list);
        lv.setAdapter(insidePlaceAdapter);



        return rootView;
    }

}
