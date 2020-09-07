package com.gildedrose;

class GildedRose {
    private final int MAX_QUALITY = 50;
    private final int MIN_QUALITY = 0;

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                //not brie or backstage pass
                if (item.quality > 0) {
                    //quality not negative
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        //not sulfuras
                        item.quality = item.quality - 1;
                        //quality decreases every day -1
                        if(item.name.contains("Conjured")){
                            //if conjured quality -=1
                            item.quality -=1;
                        }
                    }
                }
            } else {
                //possible items brie and backstage pass
                if (item.quality < MAX_QUALITY) {
                    //quality bigger than 50 not allowed
                    item.quality = item.quality + 1;
                    //quality increases day by day
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            if (item.quality < MAX_QUALITY) {
                                item.quality = item.quality + 1;
                                //quality increase of 1 for backstage pass total increase 2.
                            }
                        }
                        if (item.sellIn < 6) {
                            if (item.quality < MAX_QUALITY) {
                                item.quality = item.quality + 1;
                                //quality increase of 1 for backstage pass total increase of 3.
                            }
                        }
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                //everything but sulfuras sellIn minus 1.
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                //sellInn negative
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        //not brie or backstage pass
                        if (item.quality > MIN_QUALITY) {
                            //quality bigger than 0.
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                //not sulfuras
                                item.quality = item.quality - 1;
                                //quality of other items not brie backstage pass or sulfuras -1.
                                if(item.name.contains("Conjured")){
                                    item.quality -=1;
                                }
                            }
                        }
                    } else {
                        //backstage pass sellIn is negative
                        item.quality = 0;
                    }
                } else {
                    // item is brie
                    if (item.quality < MAX_QUALITY) {
                        item.quality = item.quality + 1;
                        // if quality smaller than max quality , quality + 1.
                    }
                }
            }
        }
    }
}