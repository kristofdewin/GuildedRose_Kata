package com.gildedrose;

public class NewItem extends Item {

    public boolean isConjured;

    public NewItem(String name, int sellIn, int quality, boolean isConjured) {
        super(name, sellIn, quality);
        this.isConjured = isConjured;
    }

}
