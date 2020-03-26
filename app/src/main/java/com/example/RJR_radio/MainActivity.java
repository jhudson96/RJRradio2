package com.example.RJR_radio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vector.RJRradio.R;

public class MainActivity extends AppCompatActivity {
    //private FirebaseAnalytics mFirebaseAnalytics;

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Toolbar	toolbar	= (Toolbar)	findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout	= (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label2));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager =	(ViewPager)	findViewById(R.id.pager);
        final PagerAdapter	adapter	= new PagerAdapter
                (getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:


            case R.id.contact_info:
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
