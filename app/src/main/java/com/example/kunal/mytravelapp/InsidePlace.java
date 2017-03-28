package com.example.kunal.mytravelapp;

/**
 * Created by kunal on 29-03-2017.
 */

public class InsidePlace {

    private String insideName;
    private String description;

    public InsidePlace(String insideName, String description) {
        this.insideName = insideName;
        this.description = description;
    }

    public String getInsideName() {
        return insideName;
    }

    public String getDescription() {
        return description;
    }
}
