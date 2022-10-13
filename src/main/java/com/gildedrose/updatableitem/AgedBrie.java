package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class AgedBrie implements UpdatableItem {

    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        if(item.quality < 50){
            item.quality++;
        }
        item.sellIn--;
    }
}
