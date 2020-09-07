package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void newItemNotConjured() {
        Item[] items = new Item[] { new NewItem("foo", 0, 0,false) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    void isConjured(){
        Item[] items = new Item[] { new NewItem("foo", 10, 50,true) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }

    @Test
    void sellDatePassedNotConjured(){
        Item[] items = new Item[] { new Item("foo", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void SellDatePassedConjured(){
        Item[] items = new Item[] { new NewItem("foo", -1, 10,true) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        //conjured items lose quality double fast 
        assertEquals(6, app.items[0].quality);
    }

}
