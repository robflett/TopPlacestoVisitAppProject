package com.codeclan.places_to_visit_in_scotland;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TopPlacesinScotlandtoVisitTest {


        @Test
        public void getListTest() {
            TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
            assertEquals(20, topPlaces.getList().size());
        }
    }

