package com.example.android.quizapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private Context context;

    private int tabTitles[] = new int[]{
            (R.string.gameOfThrones),
            (R.string.breakingBad),
            (R.string.sherlock),
            (R.string.spartacus)};

    PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GameOfThronesFragment();
        } else if (position == 1) {
            return new BreakingBadFragment();
        } else if (position == 2) {
            return new SherlockFragment();
        } else {
            return new SpartacusFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getString(tabTitles[position]);
    }
}
