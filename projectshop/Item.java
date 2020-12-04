package sk.itsovy.kovalcik.projectshop;

public abstract class Item {
    private double price; // cena za kg alebo ks,
    private String name;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract double getItemPrice();


}
