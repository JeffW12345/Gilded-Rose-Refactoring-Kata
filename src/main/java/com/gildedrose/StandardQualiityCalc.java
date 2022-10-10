package com.gildedrose;

public class StandardQualiityCalc implements IQualityCalc{


    @Override
    public void setQualityScore(Item item) {
        if (item.sellIn >= 0) {
            item.quality--;}
        else {item.quality -= 2;}
    }
}
