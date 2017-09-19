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
 * Created by Erick_lap on 19/09/2017.
 */

public class AuctionAdapter extends RecyclerView.Adapter<AuctionAdapter.ViewHolder>{

    private List<Auction>auctions;

    public AuctionAdapter(List<Auction>auctions){
        this.auctions=auctions;
    }
    public AuctionAdapter(){
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.card_auction,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Auction auction = auctions.get(position);
        holder.nameTextView.setText(auction.getTittle());
        holder.pictureImageView.setImageResource(auction.getPictureId());
        holder.durationTextView.setText(R.string.duration_text);
        holder.sampleDurationTextView.setText(auction.getDuration().HOUR_OF_DAY);
        holder.priceTextView.setText(R.string.price_text);
        holder.samplePriceTextView.setText(Float.toString(auction.getBasePrice()));

    }

    @Override
    public int getItemCount() {
        return auctions.size();
    }

    public List<Auction> getAuctions(){
        return auctions;
    }

    public AuctionAdapter setAuctions(List<Auction> auctions)
    {
        this.auctions = auctions;
        return this;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       TextView nameTextView;
       ImageView pictureImageView;
       TextView durationTextView;
       TextView sampleDurationTextView;
       TextView priceTextView;
       TextView samplePriceTextView;

       public ViewHolder(View itemView)
       {
           super(itemView);
           nameTextView = (TextView)itemView.findViewById(R.id.tileTextView);
           pictureImageView =(ImageView) itemView.findViewById(R.id.pictureImageView);
           durationTextView =(TextView)itemView.findViewById(R.id.durationTextView);
           sampleDurationTextView =(TextView)itemView.findViewById(R.id.sampleTimeTextView);
           priceTextView =(TextView)itemView.findViewById(R.id.priceTextView);
           samplePriceTextView =(TextView)itemView.findViewById(R.id.samplePriceTextView);
       }

   }
}
