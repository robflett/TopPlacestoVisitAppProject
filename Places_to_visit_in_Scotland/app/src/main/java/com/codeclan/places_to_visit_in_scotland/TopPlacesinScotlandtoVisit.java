package com.codeclan.places_to_visit_in_scotland;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TopPlacesinScotlandtoVisit {

     ArrayList<Place> listing;

    public TopPlacesinScotlandtoVisit(){

        listing = new ArrayList<Place>();
        listing.add(new Place(1, "Melvich Bay", "Sutherland", Activity.SURFING));
        listing.add(new Place(2, "Forteviot", "Perthshire", Activity.WALKING));
        listing.add(new Place(3, "Sands of Morar", "West Coast", Activity.WALKING));
        listing.add(new Place(4, "Tobermory", "Mull", Activity.FOOD));
        listing.add(new Place(5, "Skye", "Western Isles", Activity.WALKING));
        listing.add(new Place(6, "The wee green van", "Portobello Beach", Activity.FOOD));
        listing.add(new Place(7, "Callander", "Stirlingshire", Activity.HISTORIC));
        listing.add(new Place(8, "North Berwick", "East Lothian", Activity.WALKING));
        listing.add(new Place(9, "Anstruther", "Fife", Activity.FOOD));
        listing.add(new Place(10, "Wick", "Sutherland", Activity.FOOD));
        listing.add(new Place(11, "Cairngorms National Park", "Cairngorms", Activity.WALKING));
        listing.add(new Place(12, "Linlithgow Palace", "Linlithgow", Activity.HISTORIC));
        listing.add(new Place(13, "The Peat Road", "Sutherland", Activity.WALKING));
        listing.add(new Place(14, "St Andrews", "East Coast", Activity.HISTORIC));
        listing.add(new Place(15, "Arthurs Seat", "Edinburgh", Activity.WALKING));
        listing.add(new Place(16, "Loch Vennacher", "Stirlingshire", Activity.SAILING));
        listing.add(new Place(17, "Thornhill", "Stirlingshire", Activity.FOOD));
        listing.add(new Place(18, "Mallaig", "West Coast", Activity.FOOD));
        listing.add(new Place(19, "Leith Shore", "Edinburgh", Activity.FOOD));
        listing.add(new Place(20, "Coldstream Beach", "East Coast", Activity.WALKING));
    }

        public ArrayList<Place> getList(){
            return new ArrayList<Place>(listing);
    }

        public ArrayList<Place> sortByActivity(){
            new ArrayList<Place>(Arrays.asList(Place.activities.values()));
            return null;
            }

        public void addPlace (Place place){
            listing.add(place);
        }





}

