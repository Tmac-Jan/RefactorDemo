package gildedRose;

/**
 * @title: OtherItemStrategy
 * @projectName: RefactorDemo
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/8/19 22:32
 */
public class OtherItemStrategy extends ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > GildedRose.MIN_QUALITY) {
            item.setQuality(item.getQuality() - 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() > GildedRose.MIN_QUALITY ){
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
