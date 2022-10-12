package com.gildedrose;

class GildedRose {
    Item[] items;
    Items products;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        products = new Items(items);
        products.updateAll();
    }
}
