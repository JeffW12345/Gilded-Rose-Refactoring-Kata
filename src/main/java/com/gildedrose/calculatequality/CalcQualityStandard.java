package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalcQualityStandard implements CalcQuality {

    Item item;
    public CalcQualityStandard(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        if (item.sellIn > 0) {
            return --item.quality;}
        else {return item.quality -= 2;}
    }
}
