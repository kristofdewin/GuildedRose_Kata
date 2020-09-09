package com.gildedrose.rules;

import com.gildedrose.Item;

public class SulfurasRule implements Rule{
    // sulfuras item quality is always 80 and has no sellin
    @Override
    public Item applyRule(Item item) {
        item.quality = 80;
        return item;
    }
}
