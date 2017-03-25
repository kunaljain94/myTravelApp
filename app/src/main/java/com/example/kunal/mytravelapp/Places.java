package com.example.kunal.mytravelapp;

/**
 * Created by kunal on 25-03-2017.
 */

public class Places {
    //Name of places in Travel App
    private String place_Name;
    //id's in resources folder
    private int placeImageid;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Places(String place_Name, int placeImageid) {
        this.place_Name = place_Name;
        this.placeImageid = placeImageid;
    }

    public Places(String place_Name) {
        this.place_Name = place_Name;
    }

    public String getPlace_Name() {
        return place_Name;
    }

    public int getPlaceImageid() {
        return placeImageid;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
