package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalcQualityDoesNotChange implements CalcQuality {
    Item item;
    public CalcQualityDoesNotChange(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        return item.quality += 0;
    }
}
