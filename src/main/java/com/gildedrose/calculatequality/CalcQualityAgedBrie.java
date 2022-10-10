package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalcQualityAgedBrie implements CalcQuality {


    @Override
    public void setQualityScore(Item item) {
        if (item.quality < 50) item.quality++;
        }
}

