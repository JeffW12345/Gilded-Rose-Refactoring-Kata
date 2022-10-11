package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalculateQualityDoesNotChange implements CalculateQuality {
    Item item;
    public CalculateQualityDoesNotChange(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        return item.quality += 0;
    }
}
