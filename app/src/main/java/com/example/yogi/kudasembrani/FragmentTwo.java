package com.example.yogi.kudasembrani;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yogi on 05/02/18.
 */

public class FragmentTwo extends Fragment {
    TextView title;
    TextView subtitle;

    private List<Sembrani> komunikasiList = new ArrayList<>();
    private RecyclerView recyclerView;
    private SembraniAdapter mAdapter;

    public FragmentTwo(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public  View onCreateView(LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_two, container, false);

        return v;
    }
}