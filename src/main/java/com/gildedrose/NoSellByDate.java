package com.gildedrose;

public class NoSellByDate implements ICalcNewSellBy {

    @Override
    public void setSellIn(Item item) {
        // No code as this item has no sell by date.
    }
}
