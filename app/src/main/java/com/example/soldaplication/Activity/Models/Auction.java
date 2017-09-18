package com.example.soldaplication.Activity.Models;

import java.util.Date;
import java.util.Timer;

/**
 * Created by Erick_lap on 17/09/2017.
 */

public class Auction {
    private int auctionId;
    private String tittle;
    private String description;
    private int pictureId;
    private Date duration;
    private float priceBase;
    private float priceWinner;
    private String address;
    private User seller;
    private User winner;

    public Auction(int auctionId, String tittle, String description, int pictureId, Date duration, float priceBase, float priceWinner, String address, User seller, User winner) {
        this.auctionId = auctionId;
        this.tittle = tittle;
        this.description = description;
        this.pictureId = pictureId;
        this.duration = duration;
        this.priceBase = priceBase;
        this.priceWinner = priceWinner;
        this.address = address;
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

    public Date getDuration() {
        return duration;
    }

    public Auction setDuration(Date duration) {
        this.duration = duration;
        return this;
    }

    public float getPriceBase() {
        return priceBase;
    }

    public Auction setPriceBase(float priceBase) {
        this.priceBase = priceBase;
        return this;
    }

    public float getPriceWinner() {
        return priceWinner;
    }

    public Auction setPriceWinner(float priceWinner) {
        this.priceWinner = priceWinner;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Auction setAddress(String address) {
        this.address = address;
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
}
