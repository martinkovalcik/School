package sk.itsovy.kovalcik.projectshop.cart;

import sk.itsovy.kovalcik.projectshop.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> list;

    public Cart() {
        list = new ArrayList<>();
    }

    public void addItem(Item newItem){
        list.add(newItem);
    }

    public int getCountOfItemsInCart(){
        return list.size();
    }

    public double getTotalPrice(){
        double total =0;
        for (Item temp:list){
            total=total+temp.getItemPrice();
        }
        return total;
    }

    public void printCart(){
        System.out.println("List of items in your cart: ");
        for (Item temp:list){
            System.out.println(" -  "+temp.toString());
        }
    }


}
