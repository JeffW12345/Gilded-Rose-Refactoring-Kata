package com.gildedrose;

public class Items {
    public Item[] itemsList;

    public Items(int listSize) {
        this.itemsList = new Item[listSize];
    }
    public void updateQualityAll(){
        for(Item item : itemsList){
            if(item.name == "Aged Brie"){
                new CalcQualityAgedBrie().setQualityScore(item);
            }
            if(item.name == "Sulfuras, Hand of Ragnaros"){
                new CalcQualityDoesNotChange().setQualityScore(item);
            }
            if(item.name == "Backstage passes to a TAFKAL80ETC concert"){
                new CalcQualityBackstageTickets().setQualityScore(item);
            }
            else{
                new CalcQualityStandard().setQualityScore(item);
            }
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
