package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.TodayCollectionsFragment;
import fragment.TomorrowCollectionsFragment;

/**
 * Created by new on 1/23/2017.
 */

public class CollectionsNDeliveriesAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public CollectionsNDeliveriesAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TodayCollectionsFragment fragment = new TodayCollectionsFragment();
                return fragment;
            case 1:
                TomorrowCollectionsFragment fragment1 = new TomorrowCollectionsFragment();
                return fragment1;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}