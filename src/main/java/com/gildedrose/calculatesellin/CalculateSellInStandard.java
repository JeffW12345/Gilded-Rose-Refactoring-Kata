package com.gildedrose.calculatesellin;

import com.gildedrose.itemsclasses.Item;

public class CalculateSellInStandard implements CalculateSellIn {
    Item item;

    public CalculateSellInStandard(Item item) {
        this.item = item;
    }

    @Override
    public int getNewSellIn() {
        return --item.sellIn;
    }
}
