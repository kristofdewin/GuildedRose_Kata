package com.gildedrose;

import com.gildedrose.rules.RuleFactory;

class GildedRose {
    private final int MAX_QUALITY = 50;
    private final int MIN_QUALITY = 0;

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