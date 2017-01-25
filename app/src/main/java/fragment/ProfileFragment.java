package fragment;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.support.v7.widget.Toolbar;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;

        import com.bazooca.bazooca.CollectionsNDeliveries;
        import com.bazooca.bazooca.LoginActivity;
        import com.bazooca.bazooca.MainActivity;
        import com.bazooca.bazooca.NewScheduleActivity;
        import com.bazooca.bazooca.R;

public class ProfileFragment extends Fragment implements View.OnClickListener {



    private TextView tv_weather;
    private TextView tv_date;
    private TextView tv_temperature;
    private TextView tv_5Stars_count;
    private TextView tv_checked_count;
    private TextView tv_deliveries_count;
    private TextView tv_driver_name;
    private TextView tv_vehicle_info;
    private ImageView iv_profile;
    private ImageView iv_frame;
    private Toolbar toolbar;
    private ImageView back_icon;
    private TextView txt_header_name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ((MainActivity)getActivity()).hideToolBar();
        initUI(view);
        return view;
    }

    private void initUI(View v) {

        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) v.findViewById(R.id.toolbar);

//        getSupportActionBar().hide();
//        toolbar.setVisibility(View.GONE);
        // Find our drawer view
//        toolbar.setNavigationIcon(R.drawable.menu_icon);
        back_icon = (ImageView)toolbar.findViewById(R.id.back_icon);
        back_icon.setVisibility(View.VISIBLE);
        txt_header_name = (TextView) toolbar.findViewById(R.id.txt_header_name);
        txt_header_name.setVisibility(View.VISIBLE);
        txt_header_name.setText("PROFILE");
        tv_5Stars_count = (TextView) v.findViewById(R.id.tv_5Stars_count);
        tv_checked_count = (TextView) v.findViewById(R.id.tv_checked_count);
        tv_deliveries_count = (TextView) v.findViewById(R.id.tv_deliveries_count);
        tv_driver_name = (TextView) v.findViewById(R.id.tv_driver_name);
        tv_vehicle_info = (TextView) v.findViewById(R.id.tv_vehicle_info);
        iv_frame = (ImageView)v.findViewById(R.id.iv_frame);
        iv_profile = (ImageView)v.findViewById(R.id.iv_profile);

        back_icon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.back_icon:

                ((MainActivity)getActivity()).showHome();

                break;



        }
    }
}
