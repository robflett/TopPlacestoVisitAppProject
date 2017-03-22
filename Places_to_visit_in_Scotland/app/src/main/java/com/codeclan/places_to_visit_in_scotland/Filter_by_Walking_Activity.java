package com.codeclan.places_to_visit_in_scotland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Filter_by_Walking_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_by__walking_);

        TopPlacesinScotlandtoVisit walkingPlaces = new TopPlacesinScotlandtoVisit();
        walkingPlaces.getByActivity("Walking");
    }
}
