package ua.goit.store;

import ua.goit.interfase.IStore;
import ua.goit.models.ShopObject;

import java.util.HashMap;
import java.util.Map;

public class Store implements IStore {


     Map<String, ShopObject> STORE_SHOP = new HashMap<>();

    @Override
    public Map<String, ShopObject> getStoreShop() {
// Minor: here will nice to use the Builder pattern
        ShopObject shopObject = new ShopObject();
        shopObject.setProductName("A");
        shopObject.setPriceOfOne(1.25F);
        shopObject.setDiscountQuantity(3);
        shopObject.setDiscountPrice(3.00F);
        STORE_SHOP.putIfAbsent(shopObject.getProductName(), shopObject);
        ShopObject shopObject1 = new ShopObject();
        shopObject1.setProductName("B");
        shopObject1.setPriceOfOne(4.25f);
        STORE_SHOP.putIfAbsent(shopObject1.getProductName(), shopObject1);
        ShopObject shopObject2 = new ShopObject();
        shopObject2.setProductName("C");
        shopObject2.setPriceOfOne(1.00f);
        shopObject2.setDiscountQuantity(6);
        shopObject2.setDiscountPrice(5.00f);
        STORE_SHOP.putIfAbsent(shopObject2.getProductName(), shopObject2);
        ShopObject shopObject3 = new ShopObject();
        shopObject3.setProductName("D");
        shopObject3.setPriceOfOne(0.75f);
        STORE_SHOP.putIfAbsent(shopObject3.getProductName(), shopObject3);

        return STORE_SHOP;


    }
}
