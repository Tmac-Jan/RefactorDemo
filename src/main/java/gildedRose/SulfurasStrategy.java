package gildedRose;

/**
 * @title: SulfurasStrategy
 * @projectName: RefactorDemo
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/8/19 22:19
 */
public class SulfurasStrategy extends ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        item.setQuality(item.getQuality() -1);
        if (item.getSellIn() < GildedRose.MIN_QUALITY) {
            item.setQuality(item.getQuality() -1);
        }
    }
}
