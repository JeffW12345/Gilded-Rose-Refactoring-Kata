package com.gildedrose;

public class AgedBrieQualityCalc implements CalcQuality {


    @Override
    public void setQualityScore(Item item) {
        if (item.quality < 50) item.quality++;
        }
}

