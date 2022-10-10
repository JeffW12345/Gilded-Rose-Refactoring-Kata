package com.gildedrose;

public class CalcQualityDoesNotChange implements CalcQuality {
    @Override
    public void setQualityScore(Item item) {
        item.quality += 0;
    }
}
