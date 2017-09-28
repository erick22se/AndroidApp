package com.example.soldaplication.Activity.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabo on 27/09/2017.
 */

public class StoreItemRepository {
    List<StoreItem> storeItems = new ArrayList<>();

    public StoreItemRepository() {
        storeItems.add(new StoreItem("Pack 1", 50, 7.5));
        storeItems.add(new StoreItem("Pack 2", 100, 15));
        storeItems.add(new StoreItem("Pack 3", 200, 22.5));
        storeItems.add(new StoreItem("Pack 4", 400, 30));
    }

    public List<StoreItem> getStoreItems() {
        return storeItems;
    }

    public StoreItemRepository setStoreItems(List<StoreItem> storeItems) {
        this.storeItems = storeItems;
        return this;
    }

    public StoreItemRepository getInstance(){
        return this;
    }

    public int getSize(){
        return storeItems.size();
    }

    public StoreItem get(int position){
        return storeItems.get(position);
    }
}
