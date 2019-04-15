package com.example.risa.materi6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItern(int position){
        if(position == 0){
            return new FirstFragment();
        }
        else if(position == 1){
            return new SecondFragment();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0 || position % 2 == 0){
            return "First";
        }
        else if(position % 2 == 1){
            return "Second";
        }
        throw new IllegalStateException("Position not valid");
    }
}
