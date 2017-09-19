package com.example.soldaplication.Activity.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soldaplication.Activity.Models.Auction;
import com.example.soldaplication.R;

import java.util.List;

/**
 * Created by Chuis on 9/18/2017.
 */

public class AuctionsAdapter extends RecyclerView.Adapter<AuctionsAdapter.ViewHolder> {

    private List<Auction> auctions;

    @Override
    public AuctionsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_auction,parent,false));    }

    @Override
    public void onBindViewHolder(AuctionsAdapter.ViewHolder holder, int position) {
        final Auction auction = auctions.get(position);

    }

    @Override
    public int getItemCount() {
        return auctions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView pictureImageView;
        TextView durationTextView;
        TextView sampleDurationTextView;
        TextView priceTextView;
        TextView samplePriceTextView;


        public ViewHolder(View itemView) {
            super(itemView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            durationTextView = (TextView) itemView.findViewById(R.id.durationTextView);
            sampleDurationTextView = (TextView) itemView.findViewById(R.id.sampleTimeTextView);
            priceTextView = (TextView) itemView.findViewById(R.id.priceTextView);
            samplePriceTextView = (TextView) itemView.findViewById(R.id.samplePriceTextView);

        }
    }

}
