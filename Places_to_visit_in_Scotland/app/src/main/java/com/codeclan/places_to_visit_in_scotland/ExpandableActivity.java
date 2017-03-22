package com.codeclan.places_to_visit_in_scotland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExpandableActivity extends AppCompatActivity {

    TextView placeText;
    TextView locationText;
    TextView activityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandable_items);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Place place = (Place)extras.getSerializable("Place");

//        Place place = new Place();
        String placename = place.getPlacename();
        String location = place.getLocation();
        String activity = place.getActivity();

        placeText = (TextView)findViewById(R.id.placename);
//        finds the id we put into the xml file for this widget(activity)
        placeText.setText(" The name of the place is - " + placename);

        locationText = (TextView)findViewById(R.id.location);
        locationText.setText(placename + " is in " + location);

        activityText = (TextView)findViewById(R.id.activity);
        activityText.setText(placename + " is great for " + activity);

    }


}
