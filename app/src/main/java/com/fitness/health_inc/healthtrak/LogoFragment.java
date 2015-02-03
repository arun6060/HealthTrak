package com.fitness.health_inc.healthtrak;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 This fragment utilizes the onCreatView to inflate the xml file fragment_logo, this is used for
 to apply the logo as an element within the design screen as a fast effective method, allow for a
 designer to not have to utilize the <view functionality in the xml files.
 */

public class LogoFragment extends android.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_logo, container, false);
        return view;
    }


}
