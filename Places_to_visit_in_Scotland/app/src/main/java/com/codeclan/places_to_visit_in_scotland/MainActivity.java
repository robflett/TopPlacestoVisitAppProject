package com.codeclan.places_to_visit_in_scotland;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListAdapter;
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

    private final int ADD_PLACE = 1;

    public static final String LISTPLACE = "MyList";

//    NEXT - Change listView to use more block colours. Move away from the TopList format.
//   NEXT - Refactor the displayed list so it has more info in a more pleasing format.

//    NEXT - Complete the add function and ensure SharedPref is working.



    ArrayList<Place> listing;
    TopPlacesinScotlandtoVisit topPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.main_art);

        topPlaces = new TopPlacesinScotlandtoVisit();
        listing = topPlaces.getList();




        TopPlaceAdapter placeAdapter = new TopPlaceAdapter(this, listing);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(placeAdapter);

        Gson gson = new Gson();

        SharedPreferences sharedPref = getSharedPreferences(LISTPLACE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        String favourites = sharedPref.getString("listKey", "null");

        if (favourites.equals("null")){

            editor.putString("listKey", gson.toJson(listing));

            editor.apply();

        }



        TypeToken<ArrayList<Place>> placesArrayList = new TypeToken<ArrayList<Place>>(){};

        ArrayList<Place> MyList = gson.fromJson(favourites, placesArrayList.getType());






//        ListAdapter listAdapter = new ListAdapter(this, listofplaces);

//        ListView listItemView = (ListView)findViewById(R.id.list_items);
//        listItemView.setAdapter(placeAdapter);
//
//
////
//        TextView list = (TextView)findViewById(R.id.expanded_list);
//
//        String itemString = " ";
//
//        for(Place item : MyList){
//            itemString += item.getPlacename() + " " + item.getLocation() + " " + item.getActivity() + "\r\n";
//        }
//
//        list.setText(itemString);

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

    public void onPlaceClicked(View textView) {
//        TextView title = (TextView) textView;
//        Log.d("Place clicked", title.getText().toString());
        Log.d("clicking to test", textView.getTag().getClass().toString() );
       Place aplace = (Place) textView.getTag();
        Log.d("clicked", aplace.toString());
        Intent intent = new Intent(this, ExpandableActivity.class);
        intent.putExtra("Place", aplace);
        startActivity(intent);
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

//    @Override
//    protected void onActivityResult(int addedplace, int newlist, Intent toList) {
//
//        if (addedplace == ADD_PLACE) {
//
//            if (newlist == RESULT_OK) {
//
//                Place newplace = toList.getStringExtra(addNewPlaceActivity.ADD_NEW_PLACE);
//                listing.add(newplace);
//
//                TopPlaceAdapter.notifyDataSetChanged();
//            }
//        }
//    }



}
