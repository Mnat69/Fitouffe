package com.supinfo.supfitness;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nathan on 04/04/16.
 */
public class PagerAdapter extends FragmentPagerAdapter{

    public PagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Get Tab
        switch (position) {
            case 0:
                WeightTab weightTab = new WeightTab();
                return weightTab;
            case 1:
                WeightCurveTab weightCurveTab = new WeightCurveTab();
                return weightCurveTab;
            case 2:
                MapTab mapTab = new MapTab();
                return mapTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Get Tab Name
        switch (position) {
            case 0:
                return "Weight";
            case 1:
                return "Weight Curve";
            case 2:
                return "Map";
            default:
                return null;
        }
    }
}