package com.gildedrose.calculatesellin;

import com.gildedrose.itemsclasses.Item;

public class CalculateSellInNoSellInDate implements CalculateSellIn {
    Item item;
    public CalculateSellInNoSellInDate(Item item){
        this.item = item;
    }

    @Override
    public int getNewSellIn() {
        return item.sellIn;
    }
}
