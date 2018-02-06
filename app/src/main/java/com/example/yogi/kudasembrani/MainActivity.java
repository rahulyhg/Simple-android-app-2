package com.example.yogi.kudasembrani;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
//
//import com.example.yogi.kudasembrani.R;
//import com.example.yogi.kudasembrani.FragmentOne;
//import com.example.yogi.kudasembrani.FragmentTwo;
//import com.example.yogi.kudasembrani.FragmentThree;
//import com.example.yogi.kudasembrani.FragmentFour;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
//    private List<Sembrani> komunikasiList = new ArrayList<>();
//    private RecyclerView recyclerView;
//    private SembraniAdapter mAdapter;
    private int[] tabIcons = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();


//        mAdapter = new SembraniAdapter(this, komunikasiList);
//        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        recyclerView.setAdapter(mAdapter);
//
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//
//        prepareSembraniData();
    }

//    private void prepareSembraniData() {
//        Sembrani sembrani = new Sembrani(R.mipmap.ic_launcher_round, "Action & Adventure", "2015");
//        komunikasiList.add(sembrani);
//
//        sembrani = new Sembrani(R.mipmap.ic_launcher, "Animation", "2016");
//        komunikasiList.add(sembrani);
//
//        sembrani = new Sembrani(R.mipmap.ic_launcher, "Kids", "2017");
//        komunikasiList.add(sembrani);
//
//        sembrani = new Sembrani(R.mipmap.ic_launcher, "Family", "2018");
//        komunikasiList.add(sembrani);
//        mAdapter.notifyDataSetChanged();
//    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentOne(), "ONE");
        adapter.addFrag(new FragmentTwo(), "TWO");
        adapter.addFrag(new FragmentThree(), "THREE");
        adapter.addFrag(new FragmentFour(), "FOUR");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }

        @Override
        public Fragment getItem(int position){
            return mFragmentList.get(position);
        }

        @Override
        public int getCount(){
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return mFragmentTitleList.get(position);
        }
    }
}
