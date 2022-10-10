package com.gildedrose;

public class CalcQualityStandard implements CalcQuality {


    @Override
    public void setQualityScore(Item item) {
        if (item.sellIn >= 0) {
            item.quality--;}
        else {item.quality -= 2;}
    }
}
