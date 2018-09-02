package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.place_list, container, false);

            // Create a list of places
            final ArrayList<Place> places = new ArrayList<Place>();
            places.add(new Place(getString(R.string.rlocation1), getString(R.string.res1)));
            places.add(new Place(getString(R.string.rlocation2), getString(R.string.res2)));
            places.add(new Place(getString(R.string.rlocation3), getString(R.string.res3)));
            places.add(new Place(getString(R.string.rlocation4), getString(R.string.res4)));
            places.add(new Place(getString(R.string.rlocation5), getString(R.string.res5)));

            // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
            // adapter knows how to create list items for each item in the list.
            PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Place place = places.get(position);

                }
            });

            return rootView;
    }


}
