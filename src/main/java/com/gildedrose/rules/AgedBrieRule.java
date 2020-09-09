package com.gildedrose.rules;

import com.gildedrose.Item;

public class AgedBrieRule implements Rule {

    //special item, earns 1 quality every day
    //quality never negative
    //if sellin negative quality +1

    @Override
    public Item applyRule(Item item) {
        if (item.quality < 50 && item.quality>=0){
            item.quality += 1;
            if (item.sellIn < 0 && item.quality < 50) {
                item.quality += 1;
            }
        }
        item.sellIn -= 1;
        return item;
    }
}
