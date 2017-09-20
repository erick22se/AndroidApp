package com.example.soldaplication.Activity.Models;


import java.util.Calendar;

import java.util.Date;

/**
 * Created by Erick_lap on 17/09/2017.
 */

public class Auction {
    private int auctionId;
    private String tittle;
    private String description;
    private int pictureId;

    private Calendar duration;
    private float basePrice;
    private float winnerPrice;
    private User seller;
    private User winner;

    public Auction(int auctionId, String tittle, String description, int pictureId, Calendar duration, float basePrice, float winnerPrice, User seller, User winner) {
        this.auctionId = auctionId;
        this.tittle = tittle;
        this.description = description;
        this.pictureId = pictureId;
        this.duration = duration;
        this.basePrice = basePrice;
        this.winnerPrice = winnerPrice;
        this.seller = seller;
        this.winner = winner;
    }

    public Auction() {
    }

    public int getAuctionId() {
        return auctionId;
    }

    public Auction setAuctionId(int auctionId) {
        this.auctionId = auctionId;
        return this;
    }

    public String getTittle() {
        return tittle;
    }

    public Auction setTittle(String tittle) {
        this.tittle = tittle;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Auction setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getPictureId() {
        return pictureId;
    }

    public Auction setPictureId(int pictureId) {
        this.pictureId = pictureId;
        return this;
    }

    public Calendar getDuration() {
        return duration;
    }

    public Auction setDuration(Calendar duration) {
        this.duration = duration;
        return this;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public Auction setBasePrice(int basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public float getWinnerPrice() {
        return winnerPrice;
    }

    public Auction setWinnerPrice(int winnerPrice) {
        this.winnerPrice = winnerPrice;
        return this;
    }

    public User getSeller() {
        return seller;
    }

    public Auction setSeller(User seller) {
        this.seller = seller;
        return this;
    }

    public User getWinner() {
        return winner;
    }

    public Auction setWinner(User winner) {
        this.winner = winner;
        return this;
    }
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("auction_id", auctionId);
        bundle.putString("title",tittle);
        bundle.putString("description",description);
        bundle.putInt("picture_id",pictureId);
        bundle.putInt("base_price",basePrice);
        bundle.putInt("winner_price",winnerPrice);
        return bundle;
    }

    public static Auction fromBundle(Bundle bundle) {
        Auction auction = new Auction();
        return auction.setAuctionId(bundle.getInt("auction_id"))
                .setTittle(bundle.getString("title")).setDescription(bundle.getString("description"))
                .setPictureId(bundle.getInt("picture_id")).setBasePrice(bundle.getInt("base_price"))
                .setWinnerPrice(bundle.getInt("winner_price"));
    }
}
