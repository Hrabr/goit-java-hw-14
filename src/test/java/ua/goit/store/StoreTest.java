package ua.goit.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.goit.models.ShopObject;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {
    private Store store;

    @BeforeEach
    void setUp() {
        store = new Store();
    }

    @Test
    void getStoreShopSizeTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();

        assertEquals(4, storeShop.size(), "There are not 4 products in the store");
    }

    @Test
    void getProductNameATest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals("A", storeShop.get("A").getProductName(), "Product A must have a  ProductName: A");
    }

    @Test
    void getPriceOfOneProductATest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(1.25, storeShop.get("A").getPriceOfOne(), "Product A must have a  priceOfOne: 1.25");
    }

    @Test
    void getDiscountQuantityProductATest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(3, storeShop.get("A").getDiscountQuantity(), "Product A must have a  DiscountQuantity: 3");
    }

    @Test
    void getDiscountPriceProductATest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(3.0, storeShop.get("A").getDiscountPrice(), "Product A must have a  getDiscountPrice: 3.0");
    }

    @Test
    void getProductNameBTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals("B", storeShop.get("B").getProductName(), "Product B must have a  ProductName: B");
    }

    @Test
    void getPriceOfOneProductBTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(4.25, storeShop.get("B").getPriceOfOne(), "Product B must have a  priceOfOne: 1.25");
    }

    @Test
    void getDiscountQuantityProductBTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(0, storeShop.get("B").getDiscountQuantity(), "Product B must have a  DiscountQuantity: 3");
    }

    @Test
    void getDiscountPriceProductBTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(0, storeShop.get("B").getDiscountPrice(), "Product B must have a  getDiscountPrice: 0");
    }

    @Test
    void getProductNameCTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals("C", storeShop.get("C").getProductName(), "Product C must have a  ProductName: C");
    }

    @Test
    void getPriceOfOneProductCTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(1, storeShop.get("C").getPriceOfOne(), "Product C must have a  priceOfOne: 1");
    }

    @Test
    void getDiscountQuantityProductCTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(6, storeShop.get("C").getDiscountQuantity(), "Product C must have a  DiscountQuantity: 6");
    }

    @Test
    void getDiscountPriceProductCTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(5, storeShop.get("C").getDiscountPrice(), "Product C must have a  getDiscountPrice: 5");
    }

    @Test
    void getProductNameDTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals("D", storeShop.get("D").getProductName(), "Product D must have a  ProductName: D");
    }

    @Test
    void getPriceOfOneProductDTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(0.75, storeShop.get("D").getPriceOfOne(), "Product C must have a  priceOfOne: 0.75");
    }

    @Test
    void getDiscountQuantityProductDTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(0, storeShop.get("D").getDiscountQuantity(), "Product D must have a  DiscountQuantity: 0");
    }

    @Test
    void getDiscountPriceProductDTest() {
        Map<String, ShopObject> storeShop = store.getStoreShop();
        assertEquals(0, storeShop.get("D").getDiscountPrice(), "Product D must have a  getDiscountPrice: 0");
    }

    @Test
    void checkCountObjects() {
        ShopObject shopObject = new ShopObject();
        assertEquals(4, shopObject.getClass().getDeclaredFields().length, "Product D must have a  getDiscountPrice: 0");

    }
}