package com.codeclan.places_to_visit_in_scotland;

import java.util.ArrayList;




public class TopPlacesinScotlandtoVisit {

    private ArrayList<Place> place;

    public TopPlacesinScotlandtoVisit(){

        place = new ArrayList<Place>();
        place.add(new Place(1, "Melvich Bay", "Sutherland", Activity.SURFING));
        place.add(new Place(2, "Forteviot", "Perthshire", Activity.WALKING));
        place.add(new Place(3, "Sands of Morar", "West Coast", Activity.WALKING));
        place.add(new Place(4, "Tobermory", "Mull", Activity.FOOD));
        place.add(new Place(5, "Skye", "Western Isles", Activity.WALKING));
        place.add(new Place(6, "The wee green van", "Portobello Beach", Activity.FOOD));
        place.add(new Place(7, "Callander", "Stirlingshire", Activity.HISTORIC));
        place.add(new Place(8, "North Berwick", "East Lothian", Activity.WALKING));
        place.add(new Place(9, "Anstruther", "Fife", Activity.FOOD));
        place.add(new Place(10, "Wick", "Sutherland", Activity.FOOD));
        place.add(new Place(11, "Cairngorms National Park", "Cairngorms", Activity.WALKING));
        place.add(new Place(12, "Linlithgow Palace", "Linlithgow", Activity.HISTORIC));
        place.add(new Place(13, "The Peat Road", "Sutherland", Activity.WALKING));
        place.add(new Place(14, "St Andrews", "East Coast", Activity.HISTORIC));
        place.add(new Place(15, "Arthurs Seat", "Edinburgh", Activity.WALKING));
        place.add(new Place(16, "Loch Vennacher", "Stirlingshire", Activity.SAILING));
        place.add(new Place(17, "Thornhill", "Stirlingshire", Activity.FOOD));
        place.add(new Place(18, "Mallaig", "West Coast", Activity.FOOD));
        place.add(new Place(19, "Leith Shore", "Edinburgh", Activity.FOOD));
        place.add(new Place(20, "Coldstream Beach", "East Coast", Activity.WALKING));
    }

        public ArrayList<Place> getList(){
            return new ArrayList<Place>(place);
    }

        public ArrayList<Place> sortByActivity(){
            return null;
        }


}

