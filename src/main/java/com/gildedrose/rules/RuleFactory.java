package com.gildedrose.rules;

import com.gildedrose.Item;

public class RuleFactory {
    //special items
    final String AGED_BRIE = "Aged Brie";
    final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    final String SULFARAS = "Sulfuras, Hand of Ragnaros";
    // will select correct rule to use based on the item.name property
    public void getCorrectRule(Item item) {
        if (item.name.contains("Conjured")) {
            ConjuredRule rule = new ConjuredRule();
            rule.applyRule(item);
        } else if (item.name.equals(AGED_BRIE)) {
            AgedBrieRule rule = new AgedBrieRule();
            rule.applyRule(item);
        } else if (item.name.equals(BACKSTAGE_PASS)) {
            BackstagePassRule rule = new BackstagePassRule();
            rule.applyRule(item);
        } else if (item.name.equals(SULFARAS)) {
            SulfurasRule rule = new SulfurasRule();
            rule.applyRule(item);
        } else {
            ItemRule rule = new ItemRule();
            rule.applyRule(item);
        }
    }
}
