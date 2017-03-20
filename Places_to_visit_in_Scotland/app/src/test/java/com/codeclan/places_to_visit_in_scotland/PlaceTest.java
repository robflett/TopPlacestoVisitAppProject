package com.codeclan.places_to_visit_in_scotland;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaceTest {

    Place place;

    @Before
    public void before() {
        place = new Place(7, "Strontian", "West Coast", "Surfing");
    }


    @Test
    public void getRankingTest() {

        assertEquals((Integer)7, place.getRanking());
    }

    @Test
    public void getPlacenameTest() {
        assertEquals("Strontian", place.getPlacename());

    }

    @Test
    public void getLocationTest() {
        assertEquals("West Coast", place.getLocation());

    }

    @Test
    public void getActivitiesTest() {
        assertEquals("Surfing", place.getActivity());
    }

}