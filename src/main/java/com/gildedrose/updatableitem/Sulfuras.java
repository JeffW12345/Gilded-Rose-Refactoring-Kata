package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class Sulfuras implements UpdatableItem {
    Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
    }
}
