package sk.itsovy.kovalcik.projectshop.countable;

import sk.itsovy.kovalcik.projectshop.Item;

public class Water extends Item implements CountItem {
    private int count;

    public Water(double price, String name, int count) {
        super(price, name);
        this.count=count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getItemPrice() {
        return getPrice()*count;
    }
}
