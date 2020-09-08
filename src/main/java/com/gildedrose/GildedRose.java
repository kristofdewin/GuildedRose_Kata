package com.gildedrose;

import com.gildedrose.rules.RuleFactory;

class GildedRose {
    Item[] items;
    RuleFactory factory = new RuleFactory();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            factory.getCorrectRule(item);
        }
    }
}