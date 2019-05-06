package com.example.lesson4;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;

import com.example.lesson4.fragment.HomeFragment;
import com.example.lesson4.fragment.ProfileFragment;
import com.example.lesson4.fragment.SettingsFragment;
import com.example.lesson4.fragment.SearchFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BottomNavActivity extends AppCompatActivity
        implements HomeFragment.OnFragmentInteractionListener,
        SearchFragment.OnFragmentInteractionListener,
        SettingsFragment.OnFragmentInteractionListener,
        ProfileFragment.OnFragmentInteractionListener {

    @Bind(R.id.btm_navigation)
    BottomNavigationView navigation;
    @Bind(R.id.fl_layout)
    FrameLayout fl_layout;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnav);
        ButterKnife.bind(this);
        setLayout(savedInstanceState);
        setTitle("Bottom Navigation");
    }

    private void setLayout(Bundle savedInstanceState) {
        navigation.inflateMenu(R.menu.operator);
        navigation.setOnNavigationItemSelectedListener(myNavigation);
        if (savedInstanceState == null) {
            Fragment fragment = null;
            Class fragmentClass = HomeFragment.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fl_layout, fragment).addToBackStack("satu").commit();
        }
    }


    private BottomNavigationView.OnNavigationItemSelectedListener myNavigation = new BottomNavigationView.OnNavigationItemSelectedListener(){
        Fragment fragment = null;
        Class fragmentClass = HomeFragment.class;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.home:
                    fragmentClass = HomeFragment.class;
                    break;
                case R.id.search:
                    fragmentClass = SearchFragment.class;
                    break;
                case R.id.profile:
                    fragmentClass = ProfileFragment.class;
                    break;
                case R.id.setting:
                    fragmentClass = SettingsFragment.class;
                    break;
            }
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            switchFragment(fragment);
            return true;
        }
    };

    private void switchFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fl_layout,fragment)
                .commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
