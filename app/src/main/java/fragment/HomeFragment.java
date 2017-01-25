package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bazooca.bazooca.CollectionsNDeliveries;
import com.bazooca.bazooca.LoginActivity;
import com.bazooca.bazooca.MainActivity;
import com.bazooca.bazooca.NewScheduleActivity;
import com.bazooca.bazooca.R;

public class HomeFragment extends Fragment implements View.OnClickListener {


    private LinearLayout linear_calender;
    private LinearLayout linear_cancelled_collections;
    private LinearLayout linear_my_collections;
    private LinearLayout linear_schedule;
    private LinearLayout linear_temperature;
    private LinearLayout linear_weather;
    private TextView tv_weather;
    private TextView tv_date;
    private TextView tv_temperature;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        initUI(view);


        return view;
    }

    private void initUI(View v) {
        linear_calender = (LinearLayout) v.findViewById(R.id.linear_calender);
        linear_cancelled_collections = (LinearLayout) v.findViewById(R.id.linear_cancelled_collections);
        linear_my_collections = (LinearLayout) v.findViewById(R.id.linear_my_collections);
        linear_schedule = (LinearLayout) v.findViewById(R.id.linear_schedule);
        linear_temperature = (LinearLayout) v.findViewById(R.id.linear_temperature);
        linear_weather = (LinearLayout) v.findViewById(R.id.linear_weather);
        tv_date = (TextView) v.findViewById(R.id.tv_date);
        tv_temperature = (TextView) v.findViewById(R.id.tv_temperature);
        tv_weather = (TextView) v.findViewById(R.id.tv_weather);


        linear_calender.setOnClickListener(this);
        linear_cancelled_collections.setOnClickListener(this);
        linear_my_collections.setOnClickListener(this);
        linear_schedule.setOnClickListener(this);
        linear_temperature.setOnClickListener(this);
        linear_weather.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_calender:


                break;
            case R.id.linear_schedule:
                Intent intent = new Intent(getActivity(), NewScheduleActivity.class);
                startActivity(intent);

                break;
            case R.id.linear_cancelled_collections:


                break;
            case R.id.linear_my_collections:

                Intent intent1 = new Intent(getActivity(), CollectionsNDeliveries.class);
                startActivity(intent1);
                break;

            case R.id.linear_temperature:


                break;
            case R.id.linear_weather:


                break;


        }
    }
}
