package com.fitness.health_inc.healthtrak;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * This New User Class is setup to handle user input for a Name and Password via text edit fields
 * provided by the UserInfoFragment java class and associated xml files, the fragment also
 * contains the logo fragment found within the xml, a Cancel button
 * to terminate the activity and return the user to the Main activity. +
 *
 * This Java class is designed to currently make use of the fragments and also is designed to allow
 * for navigation utilizing the action bar.
 **/
public class NewUser extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_user, menu);
        return true;
    }

    // Action bar item clicks are handled here.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //Used to return functionality for the action bar icons in the Login Screen
        //If pressed uses menu_login resource
        //When executed takes user to the New User screen
        if (id == R.id.action_log_in) {

            //This intent activates the transition to the Log In screen and terminates the Activity
            Intent intent_login = new Intent(getApplicationContext(),Login.class);
            startActivity(intent_login);
            finish();
            System.exit(0);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Button that terminates activity and returns user to Home Screen
    public void cancel_click(View v){

        finish();
        System.exit(0);

    }



}
