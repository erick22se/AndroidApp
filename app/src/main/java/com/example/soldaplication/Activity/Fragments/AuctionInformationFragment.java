package com.example.soldaplication.Activity.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soldaplication.Activity.Models.Auction;
import com.example.soldaplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AuctionInformationFragment extends Fragment {


    public AuctionInformationFragment() {
        // Required empty public constructor
    }
    TextView titleTextView,descriptionTextView,basePriceTextView,durationTextView;
    ImageView auctionImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_auction_information, container, false);
        Auction auction=Auction.fromBundle(getArguments());
        titleTextView = (TextView) view.findViewById(R.id.titleInformationTextView);
        titleTextView.setText(auction.getTitle());
        descriptionTextView=(TextView) view.findViewById(R.id.descriptionInformationTextView);
        descriptionTextView.setText(auction.getDescription());
        basePriceTextView=(TextView) view.findViewById(R.id.basePriceInformationTextView);
        basePriceTextView.setText(auction.getPriceString());
        durationTextView=(TextView) view.findViewById(R.id.durationInformationTextView);
        durationTextView.setText(auction.getCompleteDuration());
        auctionImageView=(ImageView) view.findViewById(R.id.imageInformationImageView);
        auctionImageView.setImageResource(auction.getPictureId());
        return view;
    }

}
