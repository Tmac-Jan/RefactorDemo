package gildedRose;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class GildedRoseTest {
  @Test
  public void should_return_item_quality_0_And_sellIn_0_when_call_updateQuality_with_quality_1_And_sellIn_1(){
    Item[] items = new Item[] { new Item("GioRose", 1, 1) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("GioRose")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("GioRose", item.name);
    assertEquals(0, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus2_when_call_updateQuality_with_quality_2_And_sellIn_Minus1(){
    Item[] items = new Item[] { new Item("GioRose", -1, 2) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("GioRose")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("GioRose", item.name);
    assertEquals(0, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus2_when_call_updateQuality_with_quality_10_And_sellIn_1_And_itemName_is_OtherName(){
    Item[] items = new Item[] { new Item("GioRose", 1, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("GioRose")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("GioRose", item.name);
    assertEquals(9, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_Minus2_when_call_updateQuality_with_quality_49_And_sellIn_Minus1(){
    Item[] items = new Item[] { new Item("Aged Brie", -1, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Aged Brie")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Aged Brie", item.name);
    assertEquals(50, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_Minus2_when_call_updateQuality_with_quality_50_And_sellIn_Minus1(){
    Item[] items = new Item[] { new Item("Aged Brie", -1, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Aged Brie")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Aged Brie", item.name);
    assertEquals(50, item.quality);
    assertEquals(-2, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_0_when_call_updateQuality_with_quality_49_And_sellIn_1(){
    Item[] items = new Item[] { new Item("Aged Brie", 1, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Aged Brie")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Aged Brie", item.name);
    assertEquals(50, item.quality);
    assertEquals(0, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_0_when_call_updateQuality_with_quality_50_And_sellIn_0(){
    Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Aged Brie")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Aged Brie", item.name);
    assertEquals(50, item.quality);
    assertEquals(-1, item.sellIn);
  }
  @Test
  public void should_return_item_quality_10_And_sellIn_1_when_call_updateQuality_with_quality_10_And_sellIn_1_And_itemName_is_Sulfuras(){
    Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Sulfuras, Hand of Ragnaros")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Sulfuras, Hand of Ragnaros", item.name);
    assertEquals(10, item.quality);
    assertEquals(1, item.sellIn);
  }
  @Test
  public void should_return_item_quality_11_And_sellIn_10_when_call_updateQuality_with_quality_10_And_sellIn_11_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(11, item.quality);
    assertEquals(10, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_8_when_call_updateQuality_with_quality_49_And_sellIn_9_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 49) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(50, item.quality);
    assertEquals(8, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_7_when_call_updateQuality_with_quality_48_And_sellIn_8_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
      8, 48) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(50, item.quality);
    assertEquals(7, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_4_when_call_updateQuality_with_quality_47_And_sellIn_5_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
      5, 47) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(50, item.quality);
    assertEquals(4, item.sellIn);
  }
  @Test
  public void should_return_item_quality_50_And_sellIn_4_when_call_updateQuality_with_quality_50_And_sellIn_5_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
      5, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(50, item.quality);
    assertEquals(4, item.sellIn);
  }
  @Test
  public void should_return_item_quality_0_And_sellIn_Minus1_when_call_updateQuality_with_quality_48_And_sellIn_0_And_itemName_is_Backstage(){
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert",
      0, 48) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item item = Arrays.asList(items).stream().
      filter(e->e.name.equals("Backstage passes to a TAFKAL80ETC concert")).
      findFirst().orElseThrow(()->new RuntimeException("没有找到"));
    assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
    assertEquals(0, item.quality);
    assertEquals(-1, item.sellIn);
  }
}