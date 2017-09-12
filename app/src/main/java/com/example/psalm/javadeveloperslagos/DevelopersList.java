package com.example.psalm.javadeveloperslagos;

/**
 * Created by PSALM on 8/29/2017.
 */

public class DevelopersList {

    /** Github Username*/
    private String mUsername;

    /** Github Profile Url*/
    private String mProfileUrl;

    /** Github Image Url*/
    private  String mImageUrl;

    /**
     * Constructs a new {@link DevelopersList} object.
     *
     * @param username is the username of the developer
     * @param profile is the url to he developers Github Profile
     *he profile picture of the developer on Github* @param url is the website URL to find more details about the earthquake
     */
    public DevelopersList(String username, String profile, String image) {
        mUsername = username;
        mProfileUrl = profile;
        mImageUrl = image;
    }

    /** getter functions to return the various values of the params*/

    public String getmUsername() { return mUsername; }

    public String getmProfileUrl() { return mProfileUrl; }

    public String getmImageUrl() { return mImageUrl; }
}
