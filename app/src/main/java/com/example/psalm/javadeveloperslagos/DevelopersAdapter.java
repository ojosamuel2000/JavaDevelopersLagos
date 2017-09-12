package com.example.psalm.javadeveloperslagos;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by PSALM on 8/29/2017.
 */

public class DevelopersAdapter extends ArrayAdapter<DevelopersList> {

    /**
     * Constructor
     *
     * @param context  The current context.
     *
     */
    public DevelopersAdapter(Activity context, List<DevelopersList> devs) {
        super(context, 0, devs);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.developers_list_item, parent, false);
        }

        // Find the devs at the given position in the list of earthquakes
        DevelopersList currentDevs = getItem(position);

        // Find the TextView with view ID username
        TextView usernameView = (TextView) listItemView.findViewById(R.id.username);
        // Display the username of the current developer in that TextView
        usernameView.setText(currentDevs.getmUsername());

        // Find the TextView with view ID profile
        TextView profileView = (TextView) listItemView.findViewById(R.id.profile);
        // Display the profile of the current developer in that TextView
        profileView.setText(currentDevs.getmProfileUrl());

        // Find the TextView with view ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Display the image of the current developer in that TextView
        Picasso.with(getContext()).load(currentDevs.getmImageUrl()).into(imageView);

        return listItemView;
    }
}

