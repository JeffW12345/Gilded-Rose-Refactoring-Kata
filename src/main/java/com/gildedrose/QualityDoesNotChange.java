package com.gildedrose;

public class QualityDoesNotChange implements IQualityCalc{
    @Override
    public void setQualityScore(Item item) {
        item.quality += 0;
    }
}
