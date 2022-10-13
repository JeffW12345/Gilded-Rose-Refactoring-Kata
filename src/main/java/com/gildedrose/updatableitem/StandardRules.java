package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class StandardRules implements UpdatableItem {
    private Item item;

    public StandardRules(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.quality--;
        item.sellIn--;
        if(item.sellIn < 0) item.quality--;
    }
}
