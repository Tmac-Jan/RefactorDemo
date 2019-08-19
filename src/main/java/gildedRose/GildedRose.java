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
}
