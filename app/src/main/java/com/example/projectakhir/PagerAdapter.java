package com.example.projectakhir;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int numTab;
    public PagerAdapter(FragmentManager fm, int numTab){
        super(fm);
        this.numTab=numTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AlbumFragment();
            case 1:
                return new SecondFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numTab;
    }
}

