package com.gildedrose.itemsclasses;

import com.gildedrose.calculatequality.CalculateQualityAgedBrie;
import com.gildedrose.calculatequality.CalculateQualityBackstageTickets;
import com.gildedrose.calculatequality.CalculateQualityDoesNotChange;
import com.gildedrose.calculatequality.CalculateQualityStandard;
import com.gildedrose.calculatesellin.CalcSellInNoSellInDate;
import com.gildedrose.calculatesellin.CalcSellInStandard;

public class Items {
    public Item[] itemsList;

    public Items(int listSize) {
        this.itemsList = new Item[listSize];
    }
    public void updateQualityAll(){
        for(Item item : itemsList){
            if(item.name.equals("Aged Brie")){
                updateQuality(item);
                continue;
            }
            if(item.name.equals("Sulfuras, Hand of Ragnaros")){
                updateQuality(item);
                continue;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                updateQuality(item);
                continue;
            }
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

    public void updateSellByAll() {
        for(Item item : itemsList){
            if(item.name == "Sulfuras, Hand of Ragnaros"){
                new CalcSellInNoSellInDate().setSellIn(item);
            }
            else{
                new CalcSellInStandard().setSellIn(item);
            }
        }
    }
}
