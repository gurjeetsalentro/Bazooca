package fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bazooca.bazooca.IdentificationActivity;
import com.bazooca.bazooca.LoginActivity;
import com.bazooca.bazooca.MainActivity;
import com.bazooca.bazooca.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import sharepref.UserInfoShrePref;
import utils.RecyclerItemClickListener;

/**
 * Created by new on 1/23/2017.
 */

public class TodayCollectionsFragment extends Fragment {

    RecyclerView recyclerView;

    TextView txt_ride_history, txt_upcoming_ride;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.e("USER ID>> ",""+ UserInfoShrePref.getUserId(getActivity()));

        View v = inflater.inflate(R.layout.fragment_today_collections, container, false);

        initializeView(v);

        return v;
    }

    public void identificationClick(View v)
    {
        Intent intent = new Intent(getActivity(), IdentificationActivity.class);
        startActivity(intent);
    }

    private void initializeView(View v) {

        recyclerView = (RecyclerView) v.findViewById(R.id.recycleView);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(),
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Intent intent = new Intent(getActivity(), Choose_single_Driver.class);
//                        intent.putExtra("ride_id",rides_list.get(position).getRide_id());
//                        startActivity(intent);
                    }
                })
        );
//        new GetRidesHistory().execute();

    }

//    private class GetRidesHistory extends AsyncTask<String, String, String> {
//        String mResponse;
//        String status = "false";
//        String msg;
//        ProgressDialog pDialog;
//
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            pDialog = new ProgressDialog(getContext());
//            pDialog.setMessage("Please wait...");
//            pDialog.setCancelable(false);
//            pDialog.show();
//        }
//
//        @Override
//        protected String doInBackground(String... params) {
//            String mRequsetUrl = "dr_rides_history";
//            String mCharset = "UTF-8";
//            try {
//                MultiPartUtility multiPartUtility = new MultiPartUtility(mRequsetUrl, mCharset);
//
//                multiPartUtility.addFormField("user_id", UserInfoShrePref.getUserId(getActivity()));
//                mResponse = multiPartUtility.getResponse();
//                Log.e("RIDES JSON>> ",""+mResponse);
//            } catch (Exception e) {
//                Log.e("data", "----------Rides-----------" + e.getMessage());
//            }
//            return mResponse;
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            Log.e("results----", "" + s);
//            if (pDialog.isShowing())
//                pDialog.dismiss();
//
//            try {
//                rides_list.clear();
//
//                JSONObject jsonObject = new JSONObject(mResponse);
//                String data = jsonObject.getString("data");
//
//                JSONObject new_jsonObject1 = new JSONObject(data);
//                status = new_jsonObject1.getString("status");
//                msg = new_jsonObject1.getString("msg");
//
//
//                if (status.equals("true")) {
//
//                    JSONArray ride_id = new_jsonObject1.getJSONArray("ride_id");
//                    JSONArray customer_name = new_jsonObject1.getJSONArray("customer_name");
//                    JSONArray customer_profile_pic = new_jsonObject1.getJSONArray("customer_profile_pic");
//                    JSONArray car_type = new_jsonObject1.getJSONArray("car_type");
//                    JSONArray car_make = new_jsonObject1.getJSONArray("car_make");
//                    JSONArray car_model = new_jsonObject1.getJSONArray("car_model");
//                    JSONArray car_color = new_jsonObject1.getJSONArray("car_color");
//                    JSONArray pickup_address = new_jsonObject1.getJSONArray("pickup_address");
////                    JSONArray pickup_lat = new_jsonObject1.getJSONArray("pickup_lat");
////                    JSONArray pickup_long = new_jsonObject1.getJSONArray("pickup_long");
//                    JSONArray destination_address = new_jsonObject1.getJSONArray("destination_address");
////                    JSONArray destination_lat = new_jsonObject1.getJSONArray("destination_lat");
////                    JSONArray destination_long = new_jsonObject1.getJSONArray("destination_long");
//                    JSONArray journey_date_time = new_jsonObject1.getJSONArray("journey_date_time");
////                    JSONArray start_time = new_jsonObject1.getJSONArray("start_time");
////                    JSONArray end_time = new_jsonObject1.getJSONArray("end_time");
////                    JSONArray actual_total_time = new_jsonObject1.getJSONArray("actual_total_time");
////                    JSONArray actual_distance = new_jsonObject1.getJSONArray("actual_distance");
////                    JSONArray actual_fare = new_jsonObject1.getJSONArray("actual_fare");
////                    JSONArray toll = new_jsonObject1.getJSONArray("toll");
////                    JSONArray tip = new_jsonObject1.getJSONArray("tip");
////                    JSONArray cabscout_fee = new_jsonObject1.getJSONArray("cabscout_fee");
////                    JSONArray total_bill = new_jsonObject1.getJSONArray("total_bill");
//
//                    for (int i = 0; i < ride_id.length(); i++) {
//                        RidesModel model = new RidesModel();
//                        model.setRide_id(ride_id.getString(i));
//                        model.setCustomer_name(customer_name.getString(i));
//                        model.setCustomer_profile_pic(customer_profile_pic.getString(i));
//                        model.setCar_type(car_type.getString(i));
//                        model.setCar_make(car_make.getString(i));
//                        model.setCar_model(car_model.getString(i));
//                        model.setCar_color(car_color.getString(i));
//                        model.setPickup_address(pickup_address.getString(i));
////                        model.setPickup_lat(pickup_lat.getString(i));
////                        model.setPickup_long(pickup_long.getString(i));
//                        model.setDestination_address(destination_address.getString(i));
////                        model.setDestination_lat(destination_lat.getString(i));
////                        model.setDestination_long(destination_long.getString(i));
//                        model.setJourney_date_time(journey_date_time.getString(i));
////                        model.setStart_time(start_time.getString(i));
////                        model.setEnd_time(end_time.getString(i));
////                        model.setActual_total_time(actual_total_time.getString(i));
////                        model.setActual_distance(actual_distance.getString(i));
////                        model.setActual_fare(actual_fare.getString(i));
////                        model.setToll(toll.getString(i));
////                        model.setTip(tip.getString(i));
////                        model.setCabscout_fee(cabscout_fee.getString(i));
////                        model.setTotal_bill(total_bill.getString(i));
//
//                        rides_list.add(model);
//                    }
//                    ridesAdapter = new RidesAdapter(rides_list, getActivity(), "history");
//                    recyclerView.setAdapter(ridesAdapter);
//                    Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
//
//
//
//                } else {
//                    Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//                Log.e("EXECEPTION RIDES>>> ",""+e.toString());
//            }
//
//        }
//    }

}
