package com.bazooca.bazooca;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.IntentCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import org.json.JSONObject;

import customview.CircleImageView;
import fragment.HomeFragment;
import fragment.ProfileFragment;
import sharepref.UserInfoShrePref;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private NavigationView nvDrawer;
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle drawerToggle;
    private Toolbar toolbar;

    private ImageButton btn_close;
    private Button btn_delivery;
    private Button btn_profile;
    private TextView txt_header_name;
    private ImageView back_icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);
        setContentView(R.layout.activity_main);


//        user_id = UserInfoShrePref.getUserId(this);
//        Log.e("USER ID>> ",""+user_id);

        initializeView();
        setTitle("");
        txt_header_name.setText("Home");
        // Tie DrawerLayout events to the ActionBarToggle
        mDrawer.addDrawerListener(drawerToggle);
        HomeFragment driverMapFragment = new HomeFragment();
        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, driverMapFragment).commit();

        // Setup drawer view
//        setupDrawerContent(nvDrawer);
    }


    private void initializeView() {
        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().hide();
//        toolbar.setVisibility(View.GONE);
        // Find our drawer view
//        toolbar.setNavigationIcon(R.drawable.menu_icon);
        back_icon = (ImageView)toolbar.findViewById(R.id.back_icon);

        txt_header_name = (TextView) toolbar.findViewById(R.id.txt_header_name);
        txt_header_name.setVisibility(View.VISIBLE);

        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawerToggle = setupDrawerToggle();

        // Find our drawer view
        nvDrawer = (NavigationView) findViewById(R.id.nav_view);
        nvDrawer.setItemIconTintList(null);

        View view = nvDrawer.inflateHeaderView(R.layout.nav_drawer_layout);

        btn_close = (ImageButton) view.findViewById(R.id.btn_close);
        btn_delivery = (Button) view.findViewById(R.id.btn_delivery);
        btn_profile = (Button) view.findViewById(R.id.btn_profile);

        btn_close.setOnClickListener(this);
        btn_delivery.setOnClickListener(this);
        btn_profile.setOnClickListener(this);
        back_icon.setOnClickListener(this);



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Get item selected and deal with it
        switch (item.getItemId()) {
            case android.R.id.home:
                //called when the up affordance/carat in actionbar is pressed
                txt_header_name.setText("HOME");
                drawerToggle.setDrawerIndicatorEnabled(true);
                toolbar.setNavigationIcon(R.drawable.menu_icon);
                back_icon.setVisibility(View.GONE);
                Fragment fragment = new HomeFragment();

                if (fragment != null) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
                }
                return true;

        }

        return false;
    }
    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    }

    // `onPostCreate` called when activity start-up is complete after `onStart()`
    // NOTE! Make sure to override the method with only a single `Bundle` argument
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        drawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId())
        {
//            case android.R.id.home:
//
//
//
//                break;
            case R.id.btn_close:

                mDrawer.closeDrawers();
            break;

            case R.id.btn_delivery:
                txt_header_name.setText(btn_delivery.getText().toString());
                // Close the navigation drawer
                mDrawer.closeDrawers();

                break;

            case R.id.btn_profile:

                fragment = new ProfileFragment();

                // Close the navigation drawer
                mDrawer.closeDrawers();
            break;
            case R.id.back_icon:


            break;

        }



        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        }
    }

    public void hideToolBar() {
        getSupportActionBar().hide();

    }
    public void showToolBar() {
        txt_header_name.setText("HOME");
        getSupportActionBar().show();

    }

    public void showHome() {
        txt_header_name.setText("HOME");
        getSupportActionBar().show();
        Fragment fragment = new HomeFragment();
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        }
    }
}