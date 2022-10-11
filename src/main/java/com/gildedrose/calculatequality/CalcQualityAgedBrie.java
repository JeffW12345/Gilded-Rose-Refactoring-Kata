package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalcQualityAgedBrie implements CalcQuality {

    Item item;

    public CalcQualityAgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        if (item.quality < 50) return ++item.quality;
        return item.quality;}
}

