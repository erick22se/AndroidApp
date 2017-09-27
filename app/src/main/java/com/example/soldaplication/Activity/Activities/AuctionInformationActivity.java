package com.example.soldaplication.Activity.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soldaplication.Activity.Models.Auction;
import com.example.soldaplication.R;

public class AuctionInformationActivity extends AppCompatActivity {

    TextView titleTextView;
    TextView descriptionTextView;
    TextView basePriceTextView;
    TextView durationTextView;
    ImageView auctionImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auction_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Auction auction = Auction.fromBundle(getIntent().getExtras());
        
        //TODO: Human Error

        titleTextView = (TextView) findViewById(R.id.titleInformationTextView);
        titleTextView.setText(auction.getTitle());
        descriptionTextView=(TextView) findViewById(R.id.descriptionInformationTextView);
        descriptionTextView.setText(auction.getDescription());
        basePriceTextView=(TextView) findViewById(R.id.basePriceInformationTextView);
        basePriceTextView.setText(auction.getPriceString());
        durationTextView=(TextView) findViewById(R.id.durationInformationTextView);
        durationTextView.setText(auction.getCompleteDuration());
        auctionImageView=(ImageView) findViewById(R.id.imageInformationImageView);
        auctionImageView.setImageResource(auction.getPictureId());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
