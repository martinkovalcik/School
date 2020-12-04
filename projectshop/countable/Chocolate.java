package sk.itsovy.kovalcik.projectshop.countable;

import sk.itsovy.kovalcik.projectshop.Item;

public class Chocolate extends Item implements CountItem {
    private int count;

    public Chocolate(double price, String name,int count) {
        super(price, name);
        this.count=count;
    }

    @Override
    public double getItemPrice() {
        return getPrice()*count;
    }

    @Override
    public int getCount() {
        return count;
    }
}
