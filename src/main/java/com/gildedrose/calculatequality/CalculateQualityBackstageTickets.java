package com.gildedrose.calculatequality;

import com.gildedrose.itemsclasses.Item;

public class CalculateQualityBackstageTickets implements CalculateQuality {
    Item item;
    public CalculateQualityBackstageTickets(Item item) {
        this.item = item;
    }

    @Override
    public int getNewQualityScore() {
        if(item.quality < 49 && item.sellIn < 11 && item.sellIn > 5){
            return item.quality +=2;
        }
        if(item.quality < 48 && item.sellIn < 6 && item.sellIn > 0){
            return item.quality += 3;
        }
        if(item.sellIn < 1){
            return 0;
        }
        return item.quality;
    }
}
