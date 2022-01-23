package ua.goit;

import ua.goit.interfase.IStore;
import ua.goit.store.Basket;
import ua.goit.store.Store;

public class Main {
    public static void main(String[] args) {

        IStore iStore=new Store();
        Basket basket= new Basket(iStore);
     Object t = basket.calculateTotalCost(  "aaabbbcccddd");

        System.out.println(t);
    }
}
