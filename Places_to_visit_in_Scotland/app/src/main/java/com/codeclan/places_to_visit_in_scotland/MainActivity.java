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

    ArrayList<Place> listing;
    TopPlacesinScotlandtoVisit topPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listing = topPlaces.getList();

//
//        listing = new ArrayList<Place>();
//        listing.add(new Place(1, "Melvich Bay", "Sutherland", "Surfing"));
//        listing.add(new Place(2, "Forteviot", "Perthshire", "Walking"));
//        listing.add(new Place(3, "Sands of Morar", "West Coast", "Walking"));
//        listing.add(new Place(4, "Tobermory", "Mull", "Food"));
//        listing.add(new Place(5, "Skye", "Western Isles", "Walking"));
//        listing.add(new Place(6, "The wee green van", "Portobello Beach","Food"));
//        listing.add(new Place(7, "Callander", "Stirlingshire", "Historic"));
//        listing.add(new Place(8, "North Berwick", "East Lothian", "Walking"));
//        listing.add(new Place(9, "Anstruther", "Fife", "Food"));
//        listing.add(new Place(10, "Wick", "Sutherland", "Food"));
//        listing.add(new Place(11, "Cairngorms National Park", "Cairngorms", "Walking"));
//        listing.add(new Place(12, "Linlithgow Palace", "Linlithgow", "Historic"));
//        listing.add(new Place(13, "The Peat Road", "Sutherland", "Walking"));
//        listing.add(new Place(14, "St Andrews", "East Coast", "Historic"));
//        listing.add(new Place(15, "Arthurs Seat", "Edinburgh", "Walking"));
//        listing.add(new Place(16, "Loch Vennacher", "Stirlingshire", "Sailing"));
//        listing.add(new Place(17, "Thornhill", "Stirlingshire", "Food"));
//        listing.add(new Place(18, "Mallaig", "West Coast", "Food"));
//        listing.add(new Place(19, "Leith Shore", "Edinburgh", "Food"));
//        listing.add(new Place(20, "Coldstream Beach", "East Coast", "Walking"));

        TopPlacesinScotlandtoVisit topPlaces = new TopPlacesinScotlandtoVisit();
        ArrayList<Place> listofplaces = topPlaces.getList();

        TopPlaceAdapter placeAdapter = new TopPlaceAdapter(this, listofplaces);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(placeAdapter);


        SharedPreferences sharedPref = getSharedPreferences(LISTPLACE, Context.MODE_PRIVATE);
        String favourites = sharedPref.getString("listKey", "null");


        //Check if favourites.equals("null");
        //if it's "null" save listing to sharedPreferences
        //Else carry on

        Gson gson = new Gson();

        TypeToken<ArrayList<Place>> placesArrayList = new TypeToken<ArrayList<Place>>(){};

        ArrayList<Place> myList = gson.fromJson(favourites, placesArrayList.getType());

        //Create ListView with list_items
        //Use setTag(a Place object) in TopPlaceAdapter to setTag of a ListItem aplace


        TextView list = (TextView)findViewById(R.id.favourites_list);

        String itemString = " ";

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
