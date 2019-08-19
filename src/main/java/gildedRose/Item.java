package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;

    public ItemStrategy getItemStrategy() {
        return itemStrategy;
    }

    public void setItemStrategy(ItemStrategy itemStrategy) {
        this.itemStrategy = itemStrategy;
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemStrategy = ItemStrategyBeanFactory.getItemStrategy(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.itemStrategy = ItemStrategyBeanFactory.getItemStrategy(name);
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
