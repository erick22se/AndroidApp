package com.example.soldaplication.Activity.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.soldaplication.Activity.Activities.StoreCalculatorActivity;
import com.example.soldaplication.Activity.Adapters.StoreItemAdapter;
import com.example.soldaplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StoreFragment extends Fragment {
    RecyclerView storeRecyclerView;
    StoreItemAdapter storeItemAdapter;
    RecyclerView.LayoutManager storeLayoutManager;
    Button storeButton;

    public StoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_store, container, false);
        storeItemAdapter = new StoreItemAdapter();
        storeLayoutManager = new GridLayoutManager(view.getContext(), 2);
        storeRecyclerView = (RecyclerView) view.findViewById(R.id.storeRecyclerView);
        storeRecyclerView.setAdapter(storeItemAdapter);
        storeRecyclerView.setLayoutManager(storeLayoutManager);
        storeButton = view.findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), StoreCalculatorActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
