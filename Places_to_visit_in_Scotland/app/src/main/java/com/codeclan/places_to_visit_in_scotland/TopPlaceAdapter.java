package com.codeclan.places_to_visit_in_scotland;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2017.
 */

public class TopPlaceAdapter extends ArrayAdapter<Place> {

    public TopPlaceAdapter(Context context, ArrayList<Place> places){

        super(context, 0, places);

    }



    @Override
    public View getView(int position, View listPlacesView, ViewGroup parent){

        if (listPlacesView == null) {

            listPlacesView = LayoutInflater.from(getContext()).inflate(R.layout.places_items, parent, false);

        }

        Place aplace = getItem(position);

        TextView ranking = (TextView) listPlacesView.findViewById(R.id.ranking);
        ranking.setText(aplace.getRanking().toString() );

        TextView placename = (TextView) listPlacesView.findViewById(R.id.placename);
        placename.setText(aplace.getPlacename() );

        TextView location = (TextView) listPlacesView.findViewById(R.id.location);
        location.setText(aplace.getLocation().toString() );

        TextView activity = (TextView) listPlacesView.findViewById(R.id.activity);
        activity.setText(aplace.getActivity().toString());

        return listPlacesView;

    }
}
