package com.codeclan.places_to_visit_in_scotland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Filter_by_Food_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_by__food_);


        TopPlacesinScotlandtoVisit walkingPlaces = new TopPlacesinScotlandtoVisit();
        walkingPlaces.getByActivity("Food");


        String filteredPlaces = "";

        for(Place place : walkingPlaces.getByActivity("Food")){
            filteredPlaces += place.getPlacename() + " in " + place.getLocation() + " is great for food\n";
        }

        TextView tv = (TextView) findViewById(R.id.filtered_places);
        tv.setText(filteredPlaces);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
//        Inflating the menu.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.add_new_place){
            Intent intent = new Intent(this, addNewPlaceActivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.filter_by_walking){
            Intent intent = new Intent(this, Filter_by_Walking_Activity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.filter_by_food){
            Intent intent = new Intent(this, Filter_by_Food_Activity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
