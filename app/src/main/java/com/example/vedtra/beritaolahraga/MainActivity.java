package com.example.vedtra.beritaolahraga;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new kemarin(),"kemarin");
        adapter.AddFragment(new HariIni(),"HariIni");
        adapter.AddFragment(new besok(),"Besok");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //  tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        // tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        // tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
