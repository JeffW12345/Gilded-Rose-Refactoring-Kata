package com.gildedrose;

import com.gildedrose.itemsclasses.Item;
import com.gildedrose.itemsclasses.Items;

class GildedRose {
    Item[] items;
    Items products;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        products = new Items(items);
        products.UpdateQualityAndSellByAll();
    }
}
