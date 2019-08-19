package gildedRose;

/**
 * @title: BackstageStrategy
 * @projectName: RefactorDemo
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/8/19 22:06
 */
public class BackstageStrategy extends ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < GildedRose.MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
            if (item.getSellIn() < 11) {
                if (item.getQuality() < GildedRose.MAX_QUALITY) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
            if (item.getSellIn() < 6) {
                if (item.getQuality() < GildedRose.MAX_QUALITY) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
