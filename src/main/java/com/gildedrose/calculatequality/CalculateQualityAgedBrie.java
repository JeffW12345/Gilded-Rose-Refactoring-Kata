package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalculateQualityAgedBrie implements CalculateQuality {
    Item item;

    public CalculateQualityAgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        if (item.quality < 50) return ++item.quality;
        return item.quality;}
}

