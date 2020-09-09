package com.gildedrose.rules;

import com.gildedrose.Item;

public class BackstagePassRule implements Rule {

    //special item, earns 1 quality every day
    //quality never negative
    //if sellin negative quality set to 0
    //if sellin smaller than 11 +1 quality
    //if sellin smaller than 3 + 1 quality
    @Override
    public Item applyRule(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
            if (item.quality < 50 && item.sellIn < 11) {
                item.quality += 1;
                if (item.quality < 50 && item.sellIn < 6) {
                    item.quality += 1;
                }
            }
        }
        if (item.sellIn <= 0) {
            item.quality = 0;
        }
        item.sellIn -= 1;
        return item;
    }
}
