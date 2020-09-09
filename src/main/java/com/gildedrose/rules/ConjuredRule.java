package com.gildedrose.rules;

import com.gildedrose.Item;

//conjured item, loses 2 quality every day
//quality never negative
//if sellin negative 2 extra quality point are lost
public class ConjuredRule implements Rule {
    @Override
    public Item applyRule(Item item) {
        if (item.quality > 1) {
            item.quality -= 2;
            if (item.sellIn < 0 && item.quality > 1) {
                item.quality -= 2;
            }
        }
        item.sellIn -=1;
        return item;
    }
}
