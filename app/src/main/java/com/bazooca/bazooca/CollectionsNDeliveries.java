package com.bazooca.bazooca;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import adapters.CollectionsNDeliveriesAdapter;

public class CollectionsNDeliveries extends AppCompatActivity implements View.OnClickListener {

    private TextView txt_header_name;
    private Toolbar toolbar;
    private ImageView back_icon;
    private Button btn_refuse;
    private LinearLayout linear_calender;
    private LinearLayout linear_time;
    private LinearLayout linear_units;
    private TextView tv_date;
    private TextView tv_time;
    private TextView tv_units;
    private TextView tv_dist_center;
    private TextView tv_dist_center_name;
    private TextView btn_accept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);
        setContentView(R.layout.activity_collections_ndeliveries);
        setTitle("");
        initializeView();

    }

    private void initializeView() {
        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        txt_header_name = (TextView) toolbar.findViewById(R.id.txt_header_name);
        txt_header_name.setVisibility(View.VISIBLE);
        back_icon = (ImageView) toolbar.findViewById(R.id.back_icon);
        back_icon.setVisibility(View.VISIBLE);
//        btn_refuse = (Button) toolbar.findViewById(R.id.btn_refuse);
//        btn_refuse.setVisibility(View.VISIBLE);

        txt_header_name.setText("COLLECTIONS AND DELIVERIES");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Today"));
        tabLayout.addTab(tabLayout.newTab().setText("Tomorrow"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);



        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#F79521"));
        tabLayout.setTabTextColors(Color.BLACK, Color.parseColor("#F79521") );
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final CollectionsNDeliveriesAdapter adapter = new CollectionsNDeliveriesAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        back_icon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_icon:

                finish();
                break;



        }
    }
}
