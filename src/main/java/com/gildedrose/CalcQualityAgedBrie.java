package com.gildedrose;

public class CalcQualityAgedBrie implements CalcQuality {


    @Override
    public void setQualityScore(Item item) {
        if (item.quality < 50) item.quality++;
        }
}

