package com.gildedrose;

public class Items {
    public Item[] itemsList;

    public Items(int listSize) {
        this.itemsList = new Item[listSize];
    }
    public void updateQualityAll(){
        for(Item item : itemsList){
            if(item.name == "Aged Brie"){
                new AgedBrieQualityCalc().setQualityScore(item);
            }
            if(item.name == "Sulfuras, Hand of Ragnaros"){
                new QualityDoesNotChange().setQualityScore(item);
            }
            if(item.name == "Backstage passes to a TAFKAL80ETC concert"){
                new BackstageTicketsQualityCalc().setQualityScore(item);
            }
            else{
                new StandardQualiityCalc().setQualityScore(item);
            }
        }
    }

    public void updateSellByAll() {
        for(Item item : itemsList){
            if(item.name == "Sulfuras, Hand of Ragnaros"){
                new NoSellByDate().setSellIn(item);
            }
            else{
                new StandardCalcSellBy().setSellIn(item);
            }
        }
    }
}
