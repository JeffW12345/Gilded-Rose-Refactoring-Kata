package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalcQualityDoesNotChange implements CalcQuality {
    @Override
    public void setQualityScore(Item item) {
        item.quality += 0;
    }
}
