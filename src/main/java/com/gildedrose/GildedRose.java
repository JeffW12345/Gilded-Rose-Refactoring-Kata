package com.gildedrose;

import com.gildedrose.itemsclasses.Item;
import com.gildedrose.itemsclasses.Items;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        Items products = new Items(items.length);
        products.itemsList = items;
        products.updateQualityAll();
        products.updateSellByAll();
    }
}
