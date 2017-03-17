package com.codeclan.places_to_visit_in_scotland;

import java.util.ArrayList;


public class TopPlacesinScotlandtoVisit {

    private ArrayList<Place> place;

    public TopPlacesinScotlandtoVisit(){

        place = new ArrayList<Place>();
        place.add(new Place(1, "Melvich Bay", "Sutherland", "Surfing"));
        place.add(new Place(2, "Forteviot", "Perthshire", "Walking"));
        place.add(new Place(3, "Sands of Morar", "West Coast", "Walking"));
        place.add(new Place(4, "Tobermory", "Mull", "Food"));
        place.add(new Place(5, "Skye", "Western Isles", "Walking"));
        place.add(new Place(6, "The wee green van", "Portobello Beach", "Food"));
        place.add(new Place(7, "Callander", "Stirlingshire", "Museums"));
        place.add(new Place(8, "North Berwick", "East Lothian", "Walking"));
        place.add(new Place(9, "Anstruther", "Fife", "Food"));
        place.add(new Place(10, "Wick", "Sutherland", "Food"));
        place.add(new Place(11, "Cairngorms National Park", "Cairngorms", "Walking"));
        place.add(new Place(12, "Linlithgow Palace", "Linlithgow", "Museums"));
        place.add(new Place(13, "The Peat Road", "Sutherland", "Walking"));
        place.add(new Place(14, "St Andrews", "East Coast", "Museums"));
        place.add(new Place(15, "Arthurs Seat", "Edinburgh", "Walking"));
        place.add(new Place(16, "Loch Vennacher", "Stirlingshire", "Sailing"));
        place.add(new Place(17, "Thornhill", "Stirlingshire", "Food"));
        place.add(new Place(18, "Mallaig", "West Coast", "Food"));
        place.add(new Place(19, "Leith Shore", "Edinburgh", "Food"));
        place.add(new Place(20, "Coldstream Beach", "East Coast", "Walking"));
    }

        public ArrayList<Place> getList(){
            return new ArrayList<Place>(place);
    }


//        public void add(Place place) {
//        }
}

