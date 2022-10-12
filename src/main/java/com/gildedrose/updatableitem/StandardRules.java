package com.gildedrose.updatableitem;

import com.gildedrose.Item;

public class StandardRules implements UpdatableItem {
    Item item;

    public StandardRules(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
    }
}
