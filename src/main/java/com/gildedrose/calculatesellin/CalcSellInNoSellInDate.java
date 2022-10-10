package com.gildedrose.calculatesellin;

import com.gildedrose.itemsclasses.Item;

public class CalcSellInNoSellInDate implements CalcSellIn {

    @Override
    public void setSellIn(Item item) {
        // No code as this item has no sell by date.
    }
}
