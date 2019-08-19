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
            case "Aged Brie":
                return new AgedBrieStrategy();
            default:
                throw  new RuntimeException("没有找到！");
        }
    }
}
