package com.gildedrose;

public class StandardCalcSellBy implements ICalcNewSellBy {

    @Override
    public void setSellIn(Item item) {
        item.sellIn --;
    }
}
