package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            }
            else{

                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

                    updateBackstagePassesQuality(item);
                }
                else if (item.name.equals("Aged Brie")) {
                    updateBrieQuality(item);
                }
                else {
                    updateStandardItem(item);
                }
            }

        }
    }

    private void updateStandardItem(Item item) {
        item.sellIn--;
        if (item.sellIn < 0 && item.quality >1) {
            item.quality -= 2;
        }
        else if (item.quality>0){
            item.quality--;
        }
    }

    private void updateBrieQuality(Item item) {
        item.sellIn--;
        if (item.quality < 49 && item.sellIn <0){
            item.quality+=2;
        }
        else if (item.quality < 50) {
            item.quality++;
        }
    }

    private void updateBackstagePassesQuality(Item item) {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 6 && item.quality < 48) {
            item.quality += 3;
        } else if (item.sellIn < 11 && item.quality < 49) {
            item.quality+=2;
        } else  if (item.quality <50){
            item.quality++;

        }
    }
}