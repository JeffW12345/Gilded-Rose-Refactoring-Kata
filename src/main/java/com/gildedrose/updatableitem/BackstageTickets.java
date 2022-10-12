package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class BackstageTickets implements UpdatableItem {
    private Item item;

    public BackstageTickets(Item item) {
        this.item = item;
    }

    @Override
    public void update() {

    }
}
