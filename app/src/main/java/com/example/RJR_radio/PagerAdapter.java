package com.example.RJR_radio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int	mNumOfTabs;
    public	PagerAdapter(FragmentManager fm, int NumOfTabs)	{
        super(fm);
        this.mNumOfTabs	= NumOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch	(position)	{
            case	0:
                return	new TabFragment1();
            default:
                return	new TabFragment2();




        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
