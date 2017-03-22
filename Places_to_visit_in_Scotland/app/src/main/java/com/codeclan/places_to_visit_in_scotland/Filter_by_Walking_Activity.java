package com.codeclan.places_to_visit_in_scotland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Filter_by_Walking_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_by__walking_);

        TopPlacesinScotlandtoVisit walkingPlaces = new TopPlacesinScotlandtoVisit();
        walkingPlaces.getByActivity("Walking");
//        Log.d("filtered place", walkingPlaces.getByActivity("Walking"));

        String filteredPlaces = "";

        for(Place place : walkingPlaces.getByActivity("Walking")){
            filteredPlaces += place.getPlacename() + " in " + place.getLocation() + " is great for walking\n";
        }

        TextView tv = (TextView) findViewById(R.id.filtered_places);
        tv.setText(filteredPlaces);

    }
}
