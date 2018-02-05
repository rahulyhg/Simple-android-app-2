package com.example.yogi.kudasembrani;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yogi on 05/02/18.
 */

public class FragmentTwo extends Fragment {
    public FragmentTwo(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public  View onCreateView(LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
}