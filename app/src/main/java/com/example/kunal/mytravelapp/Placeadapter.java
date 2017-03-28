package com.example.kunal.mytravelapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kunal on 26-03-2017.
 */

class Placeadapter extends FragmentPagerAdapter{
    /*@param fm is the fragment manager that will keep each fragment's state in the adapter
            *           across swipes.
    */
    public Placeadapter(FragmentManager fm) {
        super(fm);
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new InsidePlacesFragment();
        }
        else if (position==1)
            return new InsideFoodFragment();
        else {
            return new InsideEventFragment();
        }

    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }
}
