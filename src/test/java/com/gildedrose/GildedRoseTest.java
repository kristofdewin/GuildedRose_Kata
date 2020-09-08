package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void itemTest() {
        Item[] items = new Item[]{new Item("foo", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(9,items[0].sellIn);
        assertEquals(9,items[0].quality);
    }
    @Test
    void itemPastSellTest() {
        Item[] items = new Item[]{new Item("foo", -1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-2,items[0].sellIn);
        assertEquals(8,items[0].quality);
    }

    @Test
    void AgedBrieTest() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9,items[0].sellIn);
        assertEquals(11,items[0].quality);
    }
    @Test
    void AgedBrieMaximumQualityTest() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9,items[0].sellIn);
        assertEquals(50,items[0].quality);
    }

    @Test
    void backStageTest() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14,items[0].sellIn);
        assertEquals(11,items[0].quality);
    }
    @Test
    void backStageTestElevenDays() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9,items[0].sellIn);
        assertEquals(12,items[0].quality);
    }

    @Test
    void backStageTestSixDays() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(13,items[0].quality);
    }
    @Test
    void backStageTestSixDaysMaxQualityTest() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(50,items[0].quality);
    }
    @Test
    void sulfarasTest(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,items[0].sellIn);
        assertEquals(80,items[0].quality);
    }
    @Test
    void conjuredItemSellinPositiveTest(){
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 5, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(8,items[0].quality);
    }
    @Test
    void conjuredItemSellinNegativeTest(){
        Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2,items[0].sellIn);
        assertEquals(6,items[0].quality);
    }
}