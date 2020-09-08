package com.gildedrose.rules;

import com.gildedrose.Item;

public class BackstagePassRule implements Rule {
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
