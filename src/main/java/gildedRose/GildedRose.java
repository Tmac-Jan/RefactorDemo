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
      if (isNotAgeBrieAndNotBackstagePass(items[i])) {
        decrementQuality(items[i]);
      } else {
        if (items[i].quality < MAX_QUALITY) {
          items[i].quality = items[i].quality + 1;
          if (isBackstagePass(items[i])) {

            if (isSellInSmallerThanEleven(items[i])) {
              incrementQuality(items[i]);
            }
            if (isSellInSmallerThanSix(items[i])) {
              incrementQuality(items[i]);
            }

          }
        }
      }
      if (!isSulfuras(items[i])) {
        items[i].sellIn = items[i].sellIn - 1;
      }

      if (isSellInSmallerThanZero(items[i])) {
        if (!isAgedBrie(items[i])) {
          decrementQuality(items[i]);
          if (isBackstagePass(items[i])) {
            setQualityToZero(items[i]);
          }
        } else {
          incrementQuality(items[i]);
        }
      }
    }
  }

  private boolean isNotAgeBrieAndNotBackstagePass(Item item) {
    return !isAgedBrie(item) && !isBackstagePass(item);
  }

  private void setQualityToZero(Item item) {
    item.quality = 0;
  }

  private boolean isSellInSmallerThanZero(Item item) {
    return item.sellIn < 0;
  }

  private boolean isSellInSmallerThanSix(Item item) {
    return item.sellIn < 6;
  }

  private boolean isSellInSmallerThanEleven(Item item) {
    return item.sellIn < 11;
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

  private void incrementQuality(Item item) {
    if (item.quality < MAX_QUALITY) {
      item.quality = item.quality + 1;
    }
  }
}
