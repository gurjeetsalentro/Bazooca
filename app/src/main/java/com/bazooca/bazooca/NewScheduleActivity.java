package com.bazooca.bazooca;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NewScheduleActivity extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_new_schedule);
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
        btn_refuse = (Button) toolbar.findViewById(R.id.btn_refuse);
        btn_refuse.setVisibility(View.VISIBLE);

        txt_header_name.setText("New Schedule");

        linear_calender = (LinearLayout) findViewById(R.id.linear_calender);
        linear_time = (LinearLayout) findViewById(R.id.linear_time);
        linear_units = (LinearLayout) findViewById(R.id.linear_units);

        tv_date = (TextView) findViewById(R.id.tv_date);
        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_units = (TextView) findViewById(R.id.tv_units);
        tv_dist_center = (TextView) findViewById(R.id.tv_dist_center);
        tv_dist_center_name = (TextView) findViewById(R.id.tv_dist_center_name);
        btn_accept = (TextView) findViewById(R.id.btn_accept);
        tv_units = (TextView) findViewById(R.id.tv_units);

        linear_calender.setOnClickListener(this);
        linear_time.setOnClickListener(this);
        linear_units.setOnClickListener(this);
        btn_refuse.setOnClickListener(this);
        back_icon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_calender:


                break;
            case R.id.linear_time:


                break;
            case R.id.linear_units:


                break;
            case R.id.btn_refuse:


                break;

            case R.id.linear_temperature:


                break;
            case R.id.linear_weather:


                break;
            case R.id.back_icon:
                finish();

                break;

        }
    }
}
