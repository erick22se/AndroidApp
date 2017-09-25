package com.example.soldaplication.Activity.Fragments;


import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import com.example.soldaplication.Activity.Adapters.AuctionsAdapter;
import com.example.soldaplication.Activity.Models.Auction;
import com.example.soldaplication.Activity.Models.AuctionRepository;
import com.example.soldaplication.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {
    RecyclerView auctionRecyclerView;
    AuctionsAdapter auctionAdapter;
    RecyclerView.LayoutManager auctionLayoutManager;
    AuctionRepository auctionRepository;
    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);
        Button recentButton=(Button) view.findViewById(R.id.recentButton);
        Button cheaperButton=(Button) view.findViewById(R.id.cheaperButton);
        auctionRepository=new AuctionRepository();
        auctionAdapter=new AuctionsAdapter(auctionRepository.getInstance().getAuctions());
        auctionLayoutManager=new GridLayoutManager(view.getContext(),2);
        auctionRecyclerView=(RecyclerView) view.findViewById(R.id.auctionRecyclerView) ;
        auctionRecyclerView.setAdapter(auctionAdapter);
        auctionRecyclerView.setLayoutManager(auctionLayoutManager);

        return view;
    }

}
