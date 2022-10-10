package com.gildedrose.calculatesellin;

import com.gildedrose.itemsclasses.Item;

public class CalcSellInStandard implements CalcSellIn {

    @Override
    public void setSellIn(Item item) {
        item.sellIn --;
    }
}
