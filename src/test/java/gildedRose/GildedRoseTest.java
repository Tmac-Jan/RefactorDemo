package gildedRose;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class GildedRoseTest {

  public static final String AGED_BRIE = "Aged Brie";
  public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
  public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
  public static final String MESSAGE = "没有找到";
  public static final String GIO_ROSE = "GioRose";

  @Test
  public void should_return_item_quality_0_And_sellIn_0_when_call_updateQuality_with_quality_1_And_sellIn_1_And_itemName_is_OtherName(){
    Item[] items = new Item[] { new Item(GIO_ROSE, 1, 1) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(GIO_ROSE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(GIO_ROSE, item.name);
    assertEquals(0, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus2_when_call_updateQuality_with_quality_2_And_sellIn_Minus1_And_itemName_is_OtherName(){
    Item[] items = new Item[] { new Item(GIO_ROSE, -1, 2) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(GIO_ROSE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(GIO_ROSE, item.name);
    assertEquals(0, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus2_when_call_updateQuality_with_quality_10_And_sellIn_1_And_itemName_is_OtherName(){
    Item[] items = new Item[] { new Item(GIO_ROSE, 1, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(GIO_ROSE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(GIO_ROSE, item.name);
    assertEquals(9, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_Minus2_when_call_updateQuality_with_quality_49_And_sellIn_Minus1_And_itemName_is_AgedBrie(){
    Item[] items = new Item[] { new Item(AGED_BRIE, -1, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(AGED_BRIE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(AGED_BRIE, item.name);
    assertEquals(50, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_Minus2_when_call_updateQuality_with_quality_50_And_sellIn_Minus1_And_itemName_is_AgedBrie(){
    Item[] items = new Item[] { new Item(AGED_BRIE, -1, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(AGED_BRIE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(AGED_BRIE, item.name);
    assertEquals(50, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_0_when_call_updateQuality_with_quality_49_And_sellIn_1_And_itemName_is_AgedBrie(){
    Item[] items = new Item[] { new Item(AGED_BRIE, 1, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(AGED_BRIE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(AGED_BRIE, item.name);
    assertEquals(50, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_0_when_call_updateQuality_with_quality_50_And_sellIn_0_And_itemName_is_AgedBrie(){
    Item[] items = new Item[] { new Item(AGED_BRIE, 0, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(AGED_BRIE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(AGED_BRIE, item.name);
    assertEquals(50, item.quality);
    assertEquals(-1, item.sellIn);
  }
  @Test
  public void should_return_item_quality_10_And_sellIn_1_when_call_updateQuality_with_quality_10_And_sellIn_1_And_itemName_is_Sulfuras(){
    Item[] items = new Item[] { new Item(SULFURAS_HAND_OF_RAGNAROS, 1, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(SULFURAS_HAND_OF_RAGNAROS)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(SULFURAS_HAND_OF_RAGNAROS, item.name);
    assertEquals(10, item.quality);
    assertEquals(1, item.sellIn);
  }
  @Test
  public void should_return_item_quality_11_And_sellIn_10_when_call_updateQuality_with_quality_10_And_sellIn_11_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 11, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(11, item.quality);
    assertEquals(10, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_8_when_call_updateQuality_with_quality_49_And_sellIn_9_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 9, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(50, item.quality);
    assertEquals(8, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_7_when_call_updateQuality_with_quality_48_And_sellIn_8_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,
      8, 48) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(50, item.quality);
    assertEquals(7, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_4_when_call_updateQuality_with_quality_47_And_sellIn_5_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,
      5, 47) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(50, item.quality);
    assertEquals(4, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_4_when_call_updateQuality_with_quality_50_And_sellIn_5_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,
      5, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(50, item.quality);
    assertEquals(4, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus1_when_call_updateQuality_with_quality_48_And_sellIn_0_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT,
      0, 48) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, item.name);
    assertEquals(0, item.quality);
    assertEquals(-1, item.sellIn);
  }
  @Test
  public void should_return_item_quality_48_And_sellIn_Minus1_when_call_updateQuality_with_quality_46_And_sellIn_0_And_itemName_is_AgedBrie(){
    Item[] items = new Item[] { new Item(AGED_BRIE,
      0, 46) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals(AGED_BRIE)).
      findFirst().orElseThrow(()->new RuntimeException(MESSAGE));
    assertEquals(AGED_BRIE, item.name);
    assertEquals(48, item.quality);
    assertEquals(-1, item.sellIn);
  }
}