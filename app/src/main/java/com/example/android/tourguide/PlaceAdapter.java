package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Toshiba on 1.5.18.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for the background color for this list of places
     */

    private int mcolorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places   is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mcolorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of the event or place.
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location
        locationTextView.setText(currentPlace.getLocation());


        // Add image view, according to there is an image or not
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            iconView.setImageResource(currentPlace.getmImageResourceID());
        } else {

            iconView.setVisibility(View.GONE);
        }

        // add background color to text view part in each list

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mcolorResourceId);

        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}