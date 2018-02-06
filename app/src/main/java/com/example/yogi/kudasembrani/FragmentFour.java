package com.example.yogi.kudasembrani;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by yogi on 05/02/18.
 */

public class FragmentFour extends Fragment {
    public FragmentFour(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public  View onCreateView(LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState){
        ListFragment fragment = new ListFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder, fragment);
        fragmentTransaction.commit();
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

//    public void goToAttract(View v)
//    {
//        Intent intent = new Intent(getActivity(), DetailUser.class);
//        startActivity(intent);
//    }
}