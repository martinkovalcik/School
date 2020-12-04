package sk.itsovy.kovalcik.projectshop.countable;

import sk.itsovy.kovalcik.projectshop.Item;
import sk.itsovy.kovalcik.projectshop.util.Util;

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

    @Override
    public String toString() {
        return "Apple: "+getName()+" ,Price per KG: "+getPrice()+" ,Count: "+count+" , Price: "+ Util.formatPrice(getItemPrice());
    }
}
