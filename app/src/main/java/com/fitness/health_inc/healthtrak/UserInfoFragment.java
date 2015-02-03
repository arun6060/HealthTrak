package com.fitness.health_inc.healthtrak;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
This fragment utilizes the onCreatView to inflate the xml file fragment_user_info, this is used for
 a basic out lay and functional setup for the Login function and the New User function of this app
 */
    public class UserInfoFragment extends android.app.Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_user_info, container, false);
            return view;
        }
//Test 2

}