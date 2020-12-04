package sk.itsovy.kovalcik.projectshop;

import sk.itsovy.kovalcik.projectshop.cart.Cart;
import sk.itsovy.kovalcik.projectshop.countable.Water;
import sk.itsovy.kovalcik.projectshop.uncountable.Apple;
import sk.itsovy.kovalcik.projectshop.uncountable.Peanut;
import sk.itsovy.kovalcik.projectshop.util.Util;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Item item1=new Apple(1.09,"Golden",1.5);
        Item item2=new Water(0.49,"Baldovská",6);
        Item item3=new Water(0.89,"Kofola",2);
        Item item4=new Peanut(0.69,"Arašidy",0.257);


        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.printCart();
        System.out.println("total price: "+Util.formatPrice(cart.getTotalPrice()));
        System.out.println("In old Slovak crowns: "+Util.formatPrice(Util.convertEuroToSkk(cart.getTotalPrice())));
    }
}
