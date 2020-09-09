package com.gildedrose.rules;

public class ItemRule implements Rule {

    //normal item, loses 1 quality every day
    //quality never negative
    //if sellin negative 1 extra quality point is lost
    @Override
    public com.gildedrose.Item applyRule(com.gildedrose.Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
            if (item.sellIn < 0 && item.quality > 0) {
                item.quality -= 1;
            }
        }
        item.sellIn -= 1;
        return item;
    }
}
