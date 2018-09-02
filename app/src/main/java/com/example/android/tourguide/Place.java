package com.example.android.tourguide;

/**
 * Created by Toshiba on 1.5.18.
 */

public class Place {


    /** Location of the event or place */
    private String mLocation;

    /** Name of event or place*/
    private String mName;

    /** Image of place */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param Location is the place of that event- place
     * @param Name is the name of place - event
     *
     * @param ImageResourceID is the shape
     */
    public Place(String Location, String Name, int ImageResourceID) {
        mLocation = Location;
        mName = Name;
        mImageResourceID = ImageResourceID;
    }

    /**
     * Create a new Place object.
     * @param Location is the place of that event- place
     * @param Name is the name of place - event
     */

    public Place(String Location, String Name) {
        mLocation = Location;
        mName = Name;
    }

    /**
     * Get the default location of the place.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the name of the event-place
     */
    public String getName() {
        return mName;
    }


    public int getmImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Return wheter or not using image
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}