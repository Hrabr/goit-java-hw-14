package ua.goit.store;

import ua.goit.interfase.IStore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    IStore iStore;

    public Basket(IStore iStore) {
        this.iStore = iStore;
    }


    public <T>Object calculateTotalCost(String baket) {
        float a =0;
        var storShop=iStore.getStoreShop();
        List<String> split = Arrays.asList(baket.toUpperCase().split(""));
        var collect = split.stream().collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        for (var entry : collect.entrySet())
            for (var entry1 : storShop.entrySet()) {
                if (entry.getKey().equals(entry1.getKey())) {
                    if (entry.getValue() < entry1.getValue().getDiscountQuantity() || entry1.getValue().getDiscountQuantity() == 0) {
                        a += entry.getValue().intValue() * entry1.getValue().getPriceOfOne();

                    } else {
                        a += entry.getValue().intValue() * entry1.getValue().getDiscountPrice();
                    }
                }
            }

       return a!=0? a:"Basket is empty";
    }

}
