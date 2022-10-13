package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class BackstageTickets implements UpdatableItem {
    private Item item;

    public BackstageTickets(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        if(item.quality < 50){
            item.quality++;
        }
        if(item.sellIn < 11 && item.quality < 50){
            item.quality++;
        }
        if(item.sellIn < 6 && item.quality < 50){
            item.quality++;
        }
        item.sellIn--;
        if(item.sellIn < 0){
            item.quality = 0;
        }
    }
}
