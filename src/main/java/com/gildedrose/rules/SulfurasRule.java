package com.gildedrose.rules;

import com.gildedrose.Item;

public class SulfurasRule implements Rule{
    @Override
    public Item applyRule(Item item) {
        item.quality = 80;
        return item;
    }
}
