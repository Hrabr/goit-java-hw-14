package ua.goit.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.goit.interfase.IStore;
import ua.goit.models.ShopObject;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BasketTest {
    Basket basket;
    @Mock
    IStore iStore;
@BeforeEach
void init(){
    basket=new Basket(iStore);
}

    @Test
    void calculateTotalCostForEmptyBasket() {
        Map<String, ShopObject> storeShop =new HashMap<>() ;
        ShopObject shopObject=new ShopObject();
        shopObject.setProductName("A");
        shopObject.setPriceOfOne(1.25F);
        shopObject.setDiscountQuantity(3);
        shopObject.setDiscountPrice(3.00F);

        storeShop.put(shopObject.getProductName(),shopObject);
        when(iStore.getStoreShop()).thenReturn(storeShop);
        Assertions.assertEquals("Basket is empty",basket.calculateTotalCost("sdg"));
    }
    @Test
    void calculateTotalCostForOneTapeProduct() {
        Map<String, ShopObject> storeShop =new HashMap<>() ;
ShopObject shopObject=new ShopObject();
        shopObject.setProductName("F");
        shopObject.setPriceOfOne(1.2F);
        shopObject.setDiscountQuantity(4);
        shopObject.setDiscountPrice(4.00F);

storeShop.put(shopObject.getProductName(),shopObject);
        when(iStore.getStoreShop()).thenReturn(storeShop);
        Assertions.assertEquals(28.0f,basket.calculateTotalCost("fffffff"));
    }
}