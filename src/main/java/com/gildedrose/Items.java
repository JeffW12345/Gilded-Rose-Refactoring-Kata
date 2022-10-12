package com.gildedrose;

public class Items {
    public Item[] itemsList;

    public Items(Item[] items) {
        this.itemsList = items;
    }

    public void updateAll(){
        for(Item item : itemsList){
            new UpdatableItemFactory(item).create().update();
        }
    }
}
