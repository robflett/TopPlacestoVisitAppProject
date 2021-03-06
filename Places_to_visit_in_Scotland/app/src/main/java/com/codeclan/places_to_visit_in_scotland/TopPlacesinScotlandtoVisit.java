package com.codeclan.places_to_visit_in_scotland;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//import java.util.function.Predicate;

import static android.R.id.list;


public class TopPlacesinScotlandtoVisit {

     ArrayList<Place> listing;

    public TopPlacesinScotlandtoVisit(){

        listing = new ArrayList<Place>();
        listing.add(new Place(1, "Melvich Bay", "Sutherland", "Surfing"));
        listing.add(new Place(2, "Forteviot", "Perthshire", "Walking"));
        listing.add(new Place(3, "Sands of Morar", "West Coast of Scotland", "Walking"));
        listing.add(new Place(4, "Tobermory", "Mull", "Food"));
        listing.add(new Place(5, "Skye", "the Western Isles", "Walking"));
        listing.add(new Place(6, "The wee green van", "Portobello Beach","Food"));
        listing.add(new Place(7, "Callander", "Stirlingshire", "Historic"));
        listing.add(new Place(8, "North Berwick", "East Lothian", "Walking"));
        listing.add(new Place(9, "Anstruther", "Fife", "Food"));
        listing.add(new Place(10, "Wick", "Sutherland", "Food"));
        listing.add(new Place(11, "Cairngorms National Park", "the Cairngorms", "Walking"));
        listing.add(new Place(12, "Linlithgow Palace", "Linlithgow", "Historic"));
        listing.add(new Place(13, "The Peat Road", "Sutherland", "Walking"));
        listing.add(new Place(14, "St Andrews", "East Coast of Scotland", "Historic"));
        listing.add(new Place(15, "Arthurs Seat", "Edinburgh", "Walking"));
        listing.add(new Place(16, "Loch Venachar", "Stirlingshire", "Sailing"));
        listing.add(new Place(17, "Thornhill", "Stirlingshire", "Food"));
        listing.add(new Place(18, "Mallaig", "West Coast of Scotland", "Food"));
        listing.add(new Place(19, "Leith Shore", "Edinburgh", "Food"));
        listing.add(new Place(20, "Coldstream Beach", "East Coast of Scotland", "Walking"));
    }

        public ArrayList<Place> getList(){
            return new ArrayList<Place>(listing);
    }

        public String filterByActivity(){

            Set<String> setofActivities = new HashSet<String>();

            for (Place entry : listing) {
                setofActivities.add(entry.getActivity());
            }

            for (String name : setofActivities) {
                System.out.println(name);
            }

            return setofActivities.toString();
        }

        public ArrayList<Place> getByActivity(String activity){

            ArrayList<Place> places = new ArrayList<>();


            for (Place entry : listing) {
                if (entry.getActivity().equals(activity)) {
                    places.add(entry);
                }
            }

            return places;
        }



        public void addPlace (Place place){

            listing.add(place);
        }





}

