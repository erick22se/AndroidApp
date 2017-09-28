package com.example.soldaplication.Activity.Adapters;


import android.app.AlertDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.soldaplication.Activity.Models.StoreItem;
import com.example.soldaplication.Activity.Models.StoreItemRepository;
import com.example.soldaplication.R;

import java.util.List;

/**
 * Created by Gabo on 27/09/2017.
 */

public class StoreItemAdapter extends RecyclerView.Adapter<StoreItemAdapter.ViewHolder> {

    StoreItemRepository storeItems;

    public StoreItemAdapter() {
        storeItems = new StoreItemRepository();
    }

    public StoreItemAdapter(StoreItemRepository storeItems) {
        this.storeItems = storeItems;
    }

    public StoreItemRepository getStoreItems() {
        return storeItems;
    }

    public StoreItemAdapter setStoreItems(StoreItemRepository storeItems) {
        this.storeItems = storeItems;
        return this;
    }

    @Override
    public StoreItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.card_store, parent, false));
    }

    @Override
    public void onBindViewHolder(StoreItemAdapter.ViewHolder holder, int position) {
        final StoreItem storeItem = storeItems.get(position);
        holder.itemImageView.setImageResource(R.drawable.ic_gc);
        holder.nameTextView.setText(storeItem.getName());
        holder.quantityTextView.setText("Quantity: " + storeItem.getQuantityString());
        holder.priceTextView.setText("Price: " + storeItem.getPriceString());
        holder.storeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: FINISH CONFIRMATION POPUP
                Snackbar.make(view,"Are you sure you want to buy this pack?", 15);
            }
        });
    }

    @Override
    public int getItemCount() {
        return storeItems.getSize();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView storeCardView;
        ImageView itemImageView;
        TextView nameTextView;
        TextView quantityTextView;
        TextView priceTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            storeCardView = (CardView) itemView.findViewById(R.id.storeCardView);
            itemImageView = (ImageView) itemView.findViewById(R.id.itemImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            quantityTextView = (TextView) itemView.findViewById(R.id.quantityTextView);
            priceTextView = (TextView) itemView.findViewById(R.id.priceTextView);
        }
    }
}
