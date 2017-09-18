package com.example.soldaplication.Activity.Models;

import com.example.soldaplication.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Erick_lap on 18/09/2017.
 */

public class AuctionRepository {
    private static AuctionRepository instace;
    private List<Auction> auctions;

    public static AuctionRepository getInstace()
    {
        if(instace == null) instace = new AuctionRepository();
        return instace;
    }
    public AuctionRepository()
    {
        User seller = new User();
        User buyer = new User();
        auctions = new ArrayList<>();
        auctions.add(new Auction(1,"Sample 1","Sample description", R.mipmap.ic_launcher,new Date(),100,0,seller,buyer));
        auctions.add(new Auction(2,"Sample 2","Sample description", R.mipmap.ic_launcher,new Date(),100,0,seller,buyer));
        auctions.add(new Auction(3,"Sample 3","Sample description", R.mipmap.ic_launcher,new Date(),100,0,seller,buyer));
        auctions.add(new Auction(4,"Sample 4","Sample description", R.mipmap.ic_launcher,new Date(),100,0,seller,buyer));
        auctions.add(new Auction(5,"Sample 5","Sample description", R.mipmap.ic_launcher,new Date(),100,0,seller,buyer));
    }
    public List<Auction> getAuctions()
    {
        return auctions;
    }


}
