package com.gildedrose;

import com.gildedrose.rules.RuleFactory;

class GildedRose {

    Item[] items;
    RuleFactory factory = new RuleFactory();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    //iterates over every item in the items array
    public void updateQuality() {
        for (Item item : items) {
            //factory selects correct rule to apply based on the item it receives
            factory.getCorrectRule(item);
        }
    }
}