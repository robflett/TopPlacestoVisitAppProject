package com.codeclan.places_to_visit_in_scotland;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TopPlacesinScotlandtoVisitTest {

        Place place;

        @Before
        public void before() {
        place = new Place(2, "Forteviot", "Perthshire", "Walking");
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

        @Test
        public void testFilterbyActivity(){
            TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();

            assertEquals(("[Walking, Sailing, Historic, Surfing, Food]"), topPlaces.filterByActivity());
        }

        @Test
        public void testGetbyActivity(){
            TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
//            topPlaces.getByActivity("Walking");



            assertNotNull(topPlaces.getByActivity("Walking"));
        }

    }

