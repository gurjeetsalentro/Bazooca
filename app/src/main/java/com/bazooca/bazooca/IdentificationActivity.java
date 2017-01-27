package com.bazooca.bazooca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import utils.OnSwipeTouchListener;

public class IdentificationActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_driver_name;
    private TextView tv_vehicle_info;
    private ImageView iv_profile;
    private ImageView iv_frame;
    private Toolbar toolbar;
    private ImageView back_icon;
    private TextView txt_header_name;
    private Button btn_collect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);
        setContentView(R.layout.activity_identification);
        initUI();
    }

    private void initUI() {

        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);

//        getSupportActionBar().hide();
//        toolbar.setVisibility(View.GONE);
        // Find our drawer view
//        toolbar.setNavigationIcon(R.drawable.menu_icon);
        back_icon = (ImageView)toolbar.findViewById(R.id.back_icon);
        back_icon.setVisibility(View.VISIBLE);
        txt_header_name = (TextView) toolbar.findViewById(R.id.txt_header_name);
        txt_header_name.setVisibility(View.VISIBLE);
        txt_header_name.setText("IDENTIFICATION");

        tv_driver_name = (TextView) findViewById(R.id.tv_driver_name);
        tv_vehicle_info = (TextView) findViewById(R.id.tv_vehicle_info);
        iv_frame = (ImageView)findViewById(R.id.iv_frame);
        iv_profile = (ImageView)findViewById(R.id.iv_profile);
        btn_collect = (Button)findViewById(R.id.btn_collect);

        back_icon.setOnClickListener(this);



        btn_collect.setOnTouchListener(new OnSwipeTouchListener(IdentificationActivity.this) {
            public void onSwipeTop() {
//		        Toast.makeText(IdentificationActivity.this, "top", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
//		        Toast.makeText(IdentificationActivity.this, "right", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(IdentificationActivity.this,
                        CollectActivity.class);

                startActivity(i);


                finish();
            }
            public void onSwipeLeft() {
//		        Toast.makeText(IdentificationActivity.this, "left", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(IdentificationActivity.this,
//                        CollectActivity.class);
//
//                startActivity(i);
//
//                overridePendingTransition(R.anim.activity_open_translate,
//                        R.anim.activity_close_scale);
//                finish();
            }
            public void onSwipeBottom() {
//		        Toast.makeText(IdentificationActivity.this, "bottom", Toast.LENGTH_SHORT).show();
            }

            public boolean onTouch(View v, MotionEvent event) {
                return gestureDetector.onTouchEvent(event);
            }
        });



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
