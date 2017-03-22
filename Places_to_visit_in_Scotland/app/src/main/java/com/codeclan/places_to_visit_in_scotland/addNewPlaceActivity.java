package com.codeclan.places_to_visit_in_scotland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class addNewPlaceActivity extends AppCompatActivity {

    public static final String ADD_NEW_PLACE = "newplace";

    private EditText newplaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_place);

    newplaceView = (EditText) findViewById(R.id.newplaceText);

    }

    public void addnewClicked(View view) {

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
}
