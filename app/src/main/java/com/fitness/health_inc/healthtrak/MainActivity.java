package com.fitness.health_inc.healthtrak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

/**
 *  Within this Main Activity are functions for navigating to:
 *  New User Screen, Login Screen, Exit Application, and various action bar functions
 *
 *  The New User and Login buttons are used to navigate to there respected screens
 *  The Exit Button is used to end the application
 *
 *  Currently under construction is the implementation of a search function and a new function
 *  that will be operated by the user via the action bar.
 **/


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Inflate the menu; this adds items to the action bar if it is present.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Action bar item clicks are handled here.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //If statement that allows the action bar elements to be pressed and utilized to
        //carry out some functional operation based upon what the user selects
        if (id == R.id.action_new) {
            //If the New function is selected by the user then a message is return to the user
            // via the toast function informing the user this function is under construction
            Context context = getApplicationContext();
            CharSequence text = "New Function is Under Construction";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
            return true;
        }
        //Used to return functionality for the search button being pressed in the action bar
        else if (id == R.id.action_search){
            //If the Search function is selected by the user then a message is return to the user
            // via the toast function informing the user this function is under construction
            Context context = getApplicationContext();
            CharSequence text = "Search Function is Under Construction";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    //Button for Login Screen
    public void login_click(View v){

        Intent intent_login = new Intent(getApplicationContext(),Login.class);
        startActivity(intent_login);

    }

    //Button for New User Screen
    public void new_user_click(View v){

        Intent intent_new_user = new Intent(getApplicationContext(),NewUser.class);
        startActivity(intent_new_user);

    }

    //Button for exiting application
    public void exit_click (View v){
        finish();
        System.exit(0);
    }



}
