package com.codeclan.places_to_visit_in_scotland;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LISTPLACE = "MyList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
        ArrayList<Place> listofplaces = topPlaces.getList();

        TopPlaceAdapter placeAdapter = new TopPlaceAdapter(this, listofplaces);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(placeAdapter);


        SharedPreferences sharedPref = getSharedPreferences(LISTPLACE, Context.MODE_PRIVATE);

        String favourites = sharedPref.getString("listKey", "null");


        Gson gson = new Gson();

        TypeToken<ArrayList<Place>> placesArrayList = new TypeToken<ArrayList<Place>>(){};

        ArrayList<Place> myList = gson.fromJson(favourites, placesArrayList.getType());


        TextView list = (TextView)findViewById(R.id.favourites_list);

        String itemString = "";

        for(Place item : myList){
            itemString += item.getPlacename() + " " + item.getLocation() + " " + item.getActivity() + "\r\n";
        }

        list.setText(itemString);

    }


    public void addListToSharedPreferences(View view){
        SharedPreferences sharedPref = getSharedPreferences(LISTPLACE, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPref.edit();

        Gson gson = new Gson();

        editor.putString("listKey", gson.toJson(listing));
//        listing refers to the arraylist of place objects.


        editor.apply();



        Toast.makeText(MainActivity.this, "New place to visit added!", Toast.LENGTH_LONG).show();

    }
}
