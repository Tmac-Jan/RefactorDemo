package gildedRose;

public class GildedRose {
  public static final String AGED_BRIE = "Aged Brie";
  public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT =
      "Backstage passes to a TAFKAL80ETC concert";
  public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
  public static final int MAX_QUALITY = 50;
  public static final int MIN_QUALITY = 0;
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      if (!isAgedBrie(items[i]) && !isBackstagePass(items[i])) {
        if (items[i].quality > MIN_QUALITY) {
          decrementQuality(items[i]);
        }
      } else {
        if (items[i].quality < MAX_QUALITY) {
          items[i].quality = items[i].quality + 1;

          if (isBackstagePass(items[i])) {
            if (items[i].sellIn < 11) {
              if (items[i].quality < MAX_QUALITY) {
                items[i].quality = items[i].quality + 1;
              }
            }

            if (items[i].sellIn < 6) {
              if (items[i].quality < MAX_QUALITY) {
                items[i].quality = items[i].quality + 1;
              }
            }
          }
        }
      }

      if (!isSulfuras(items[i])) {
        items[i].sellIn = items[i].sellIn - 1;
      }

      if (items[i].sellIn < 0) {
        if (!isAgedBrie(items[i])) {
          if (!isBackstagePass(items[i])) {
            if (items[i].quality > MIN_QUALITY) {
              decrementQuality(items[i]);
            }
          } else {
            items[i].quality = items[i].quality - items[i].quality;
          }
        } else {
          if (items[i].quality < MAX_QUALITY) {
            items[i].quality = items[i].quality + 1;
          }
        }
      }
    }
  }

  private boolean isBackstagePass(Item item) {
    return item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
  }

  private boolean isSulfuras(Item item) {
    return item.name.equals(SULFURAS_HAND_OF_RAGNAROS);
  }

  private boolean isAgedBrie(Item item) {
    return item.name.equals(AGED_BRIE);
  }
  private void decrementQuality(Item item) {
    if (item.quality > MIN_QUALITY) {
      if (!isSulfuras(item)) {
        item.quality = item.quality - 1;
      }
    }
  }

}
