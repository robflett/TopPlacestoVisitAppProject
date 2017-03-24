package com.codeclan.places_to_visit_in_scotland;

import java.io.Serializable;
import java.lang.reflect.Array;

//enum Activity{
//
//    SURFING, WALKING, FOOD, HISTORIC, SAILING
//
//};


public class Place implements Serializable{

    private int ranking;
    private String placename;
    private String location;
    private String activity;


    public Place(Integer ranking, String placename, String location, String activity) {
        this.ranking = ranking;
        this.placename = placename;
        this.location = location;
        this.activity = activity;

//        NEXT - Remove Ranking as a property. Maybe replace with image of local area. Regions of Scotland.
//        User would then click from options when creating their own place.

    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivities(String activity) {
        this.activity = activity;
    }
}
