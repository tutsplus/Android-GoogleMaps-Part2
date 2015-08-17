package com.tutsplus.mapsdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by Paul on 8/17/15.
 */
public class MapFragment extends SupportMapFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup parent = (ViewGroup) super.onCreateView( inflater, container, savedInstanceState );
        View overlay = inflater.inflate( R.layout.view_map_overlay, parent, false );
        parent.addView(overlay);

        return parent;
    }
}
