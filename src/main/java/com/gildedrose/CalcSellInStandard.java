package com.gildedrose;

public class CalcSellInStandard implements CalcSellIn {

    @Override
    public void setSellIn(Item item) {
        item.sellIn --;
    }
}
