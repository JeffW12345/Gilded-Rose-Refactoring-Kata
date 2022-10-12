package com.gildedrose;

import com.gildedrose.updatableitem.*;

public class UpdatableItemFactory {
    Item item;

    public UpdatableItemFactory(Item item) {
        this.item = item;
    }

    public UpdatableItem create(){
        if(item.name == "Aged Brie") {
            return new AgedBrie(item);
        }
        if(item.name == "Sulfuras, Hand of Ragnaros") {
            return new Sulfuras(item);
        }
        if(item.name == "Backstage passes to a TAFKAL80ETC concert") {
            return new BackstageTickets(item);
        }
        return new StandardRules(item);
    }
}
