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
    for (Item item : items) {
      item.getItemStrategy().updateQuality(item);
    }
  }

  private void decreaseSellIn(Item item) {
    item.sellIn -=  1;
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
