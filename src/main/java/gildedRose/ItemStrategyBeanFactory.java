package gildedRose;

/**
 * @title: ItemStrategyBeanFactory
 * @projectName: RefactorDemo
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/8/19 22:02
 */
public class ItemStrategyBeanFactory {
    public static ItemStrategy getItemStrategy(String itemName){
        switch (itemName) {
            case GildedRose.AGED_BRIE:
                return new AgedBrieStrategy();
            case GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                return new BackstageStrategy();
            default:
                throw  new RuntimeException("没有找到！");
        }
    }
}
