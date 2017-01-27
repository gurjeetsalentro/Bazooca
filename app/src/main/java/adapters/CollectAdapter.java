package adapters;


import android.content.Context;
        import android.support.v7.widget.RecyclerView;
        import android.text.Html;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bazooca.bazooca.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
        import java.util.Date;
        import java.util.List;
        import java.util.Locale;

import pojoclasses.PojoCollectData;


public class CollectAdapter extends RecyclerView.Adapter<CollectAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<PojoCollectData> collectDataList;
    public static final String inputFormat = "HH:mm";
    SimpleDateFormat inputParser = new SimpleDateFormat(inputFormat, Locale.US);

    // Provide a reference to the views for each data item_detail_activity
    // Complex data items may need more than one view per item_detail_activity, and
    // you provide access to all the views for a data item_detail_activity in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item_detail_activity is just a string in this case

        TextView tv_product_name;
        TextView tv_nota_fiscal;
        TextView tv_volumes;
        ImageView iv_camera;
        //CheckBox checkBoxPriority;

        public ViewHolder(View v) {
            super(v);
            tv_product_name = (TextView) v.findViewById(R.id.tv_product_name);
            tv_nota_fiscal = (TextView) v.findViewById(R.id.tv_nota_fiscal);
            tv_volumes = (TextView) v.findViewById(R.id.tv_volumes);
            iv_camera = (ImageView) v.findViewById(R.id.iv_camera);
            //checkBoxPriority= (CheckBox) v.findViewById(R.id.checkBoxPriority);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CollectAdapter(Context mContext, ArrayList<PojoCollectData> collectDataList) {
        this.mContext = mContext;
        this.collectDataList = collectDataList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.collect_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        if(position == 1 || position == 4)
        {
            holder.iv_camera.setImageResource(R.drawable.camera_yellow);
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return collectDataList.size();
    }


   /* private void compareDates(String compareStringOne, String compareStringTwo) {
        Calendar now = Calendar.getInstance();

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);

        Date date = parseDate(hour + ":" + minute);
        Log.e("date", date + "");
        Date dateCompareOne = parseDate(compareStringOne);
        Date dateCompareTwo = parseDate(compareStringTwo);

        if (dateCompareOne.before(date) && dateCompareTwo.after(date)) {
            //Toast.makeText(this, "inside", Toast.LENGTH_LONG).show();
        }
    }*/

    private Date parseDate(String date) {

        try {
            return inputParser.parse(date);
        } catch (java.text.ParseException e) {
            return new Date(0);
        }
    }
}