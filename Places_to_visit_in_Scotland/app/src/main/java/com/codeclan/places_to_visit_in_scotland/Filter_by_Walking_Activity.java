package com.codeclan.places_to_visit_in_scotland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
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
            filteredPlaces += place.getPlacename() + " in " + place.getLocation() + "\n";
        }

        TextView tv = (TextView) findViewById(R.id.filtered_places);
        tv.setText(filteredPlaces);



    }

//    NEXT - Below keep the buttons and menu in a superclass that the other activities inherit from.

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
//        Inflating the menu.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.main_page){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }

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
