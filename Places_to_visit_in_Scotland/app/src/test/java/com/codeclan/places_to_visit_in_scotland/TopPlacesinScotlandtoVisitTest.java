package com.codeclan.places_to_visit_in_scotland;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;



import static org.junit.Assert.assertEquals;



public class TopPlacesinScotlandtoVisitTest {

        Place place;

        @Before
        public void before() {
        place = new Place(7, "Strontian", "West Coast", "Surfing");
    }


        @Test
        public void getListTest() {
            TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
            assertEquals(20, topPlaces.getList().size());
        }

        @Test
        public void addToListTest(){
            TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
            topPlaces.addPlace(place);
            assertEquals(21, topPlaces.getList().size());

        }

    }

