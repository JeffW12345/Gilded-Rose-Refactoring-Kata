package com.gildedrose.itemsclasses;

import com.gildedrose.calculatequality.CalculateQualityAgedBrie;
import com.gildedrose.calculatequality.CalculateQualityBackstageTickets;
import com.gildedrose.calculatequality.CalculateQualityDoesNotChange;
import com.gildedrose.calculatequality.CalculateQualityStandard;
import com.gildedrose.calculatesellin.CalculateSellInNoSellInDate;
import com.gildedrose.calculatesellin.CalculateSellInStandard;

public class Items {
    public Item[] itemsList;

    public Items(Item[] items) {
        this.itemsList = items;
    }

    public void UpdateQualityAndSellByAll(){
        updateQualityAll();
        updateSellByAll();
    }
    public void updateQualityAll(){
        for(Item item : itemsList){
            updateQuality(item);
        }
    }
    private void updateQuality(Item item){
        if(item.name.equals("Aged Brie")){
            item.quality = new CalculateQualityAgedBrie(item).getNewQualityScore();
            return;
        }
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            item.quality = new CalculateQualityDoesNotChange(item).getNewQualityScore();
            return;
        }
        if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
            item.quality = new CalculateQualityBackstageTickets(item).getNewQualityScore();
        }
        else{
            item.quality = new CalculateQualityStandard(item).getNewQualityScore();
        }
    }

    public void updateSellByAll(){
        for(Item item : itemsList){
            updateSellBy(item);
        }
    }

    private void updateSellBy(Item item) {
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            item.quality = new CalculateSellInNoSellInDate(item).getNewSellIn();
        }
        else{
            item.quality = new CalculateSellInStandard(item).getNewSellIn();
        }
    }
}
