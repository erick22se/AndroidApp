package com.example.soldaplication.Activity.Adapters;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soldaplication.Activity.Activities.MainActivity;
import com.example.soldaplication.Activity.Fragments.AuctionInformationFragment;
import com.example.soldaplication.Activity.Models.Auction;
import com.example.soldaplication.*;
import com.example.soldaplication.R;

import java.util.List;

/**
 * Created by Chuis on 9/18/2017.
 */

public class AuctionsAdapter extends RecyclerView.Adapter<AuctionsAdapter.ViewHolder> {

    private List<Auction> auctions;

    public AuctionsAdapter(List<Auction> auctions) {
        this.auctions = auctions;
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

    public AuctionsAdapter setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
        return this;
    }

    @Override
    public AuctionsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_auction,parent,false));    }

    @Override
    public void onBindViewHolder(AuctionsAdapter.ViewHolder holder, int position) {
        final Auction auction = auctions.get(position);
        holder.sampleDurationTextView.setText(auction.getCompleteDuration());
        holder.samplePriceTextView.setText(auction.getPriceString());
        holder.titleTextView.setText(auction.getTitle());
        holder.pictureImageView.setImageResource(auction.getPictureId());
        holder.card_auction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Star Auction Information Activity
                AppCompatActivity appCompatActivity=(AppCompatActivity) view.getContext() ;
                appCompatActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content,new AuctionInformationFragment()).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return auctions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView pictureImageView;
        TextView durationTextView;
        TextView sampleDurationTextView;
        TextView priceTextView;
        TextView samplePriceTextView;
        CardView card_auction;

        public ViewHolder(View itemView) {
            super(itemView);
            card_auction = (CardView) itemView.findViewById(R.id.auctionCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            durationTextView = (TextView) itemView.findViewById(R.id.durationTextView);
            sampleDurationTextView = (TextView) itemView.findViewById(R.id.sampleTimeTextView);
            priceTextView = (TextView) itemView.findViewById(R.id.priceTextView);
            samplePriceTextView = (TextView) itemView.findViewById(R.id.samplePriceTextView);

        }
    }

}
