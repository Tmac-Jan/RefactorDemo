package gildedRose;

/**
 * @title: AgedBrieStrategy
 * @projectName: RefactorDemo
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/8/19 21:48
 */
public class AgedBrieStrategy extends ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < GildedRose.MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < GildedRose.MIN_QUALITY) {
            if (item.getQuality() <  GildedRose.MAX_QUALITY) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
