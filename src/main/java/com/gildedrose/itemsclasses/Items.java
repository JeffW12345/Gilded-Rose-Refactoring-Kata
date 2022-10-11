package com.gildedrose.itemsclasses;

import com.gildedrose.calculatequality.CalcQualityAgedBrie;
import com.gildedrose.calculatequality.CalcQualityBackstageTickets;
import com.gildedrose.calculatequality.CalcQualityDoesNotChange;
import com.gildedrose.calculatequality.CalcQualityStandard;
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
                updateQuality(CalcQualityAgedBrie.class, item);
                continue;
            }
            if(item.name.equals("Sulfuras, Hand of Ragnaros")){
                updateQuality(ProductType.SULFURAS, item);
                continue;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                updateQuality(ProductType.BACKSTAGE_PASSES, item);
                continue;
            }
            updateQuality(ProductType.STANDARD_ITEMS, item);
        }
    }

    private void updateQuality(Class<?> cls, Item item){

    }
    private void updateQuality(ProductType productType, Item item) {
        if(productType == ProductType.AGED_BRIE){
            item.quality = new CalcQualityAgedBrie(item).getNewQualityScore();
        }
        if(productType == ProductType.SULFURAS){
            item.quality = new CalcQualityDoesNotChange(item).getNewQualityScore();
        }
        if(productType == ProductType.BACKSTAGE_PASSES){
            item.quality = new CalcQualityBackstageTickets(item).getNewQualityScore();
        }
        if(productType == ProductType.STANDARD_ITEMS){
            item.quality = new CalcQualityStandard(item).getNewQualityScore();
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
