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
}