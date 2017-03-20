package com.codeclan.places_to_visit_in_scotland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
        ArrayList<Place> listofplaces = topPlaces.getList();

        TopPlaceAdapter placeAdapter = new TopPlaceAdapter(this, listofplaces);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(placeAdapter);




    }
}
