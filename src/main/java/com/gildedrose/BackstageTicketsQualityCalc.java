package com.gildedrose;

public class BackstageTicketsQualityCalc implements IQualityCalc {
    @Override
    public void setQualityScore(Item item) {
        if(item.quality < 50 && item.sellIn < 11 && item.sellIn > 5){
            item.quality +=2;
        }
        if(item.quality < 50 && item.sellIn < 6 && item.sellIn > 0){
            item.quality += 3;
        }
        if(item.sellIn <1){
            item.quality = 0;
        }
    }
}