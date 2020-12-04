package sk.itsovy.kovalcik.projectshop.uncountable;

import sk.itsovy.kovalcik.projectshop.Item;
import sk.itsovy.kovalcik.projectshop.util.Util;

public class Apple extends Item implements WeightItem{

    private double weight;

    public Apple(double price, String name, double weight) {
        super(price, name);
        this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getItemPrice() {
        return weight*getPrice();
    }

    @Override
    public String toString() {
        return "Apple: "+getName()+" ,Price per KG: "+getPrice()+" ,Weight: "+weight+" , Price: "+ Util.formatPrice(getItemPrice());
    }
}
