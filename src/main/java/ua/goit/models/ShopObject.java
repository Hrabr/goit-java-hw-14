package ua.goit.models;

public class ShopObject {
    private String productName;
    private float priceOfOne;
    private int discountQuantity;
    private float discountPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPriceOfOne() {
        return priceOfOne;
    }

    public void setPriceOfOne(float priceOfOne) {
        this.priceOfOne = priceOfOne;
    }

    public int getDiscountQuantity() {
        return discountQuantity;
    }

    public void setDiscountQuantity(int discountQuantity) {
        this.discountQuantity = discountQuantity;
    }

    public float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(float discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "ShopObject{" +
                "productName='" + productName + '\'' +
                ", priceOfOne=" + priceOfOne +
                ", discountQuantity=" + discountQuantity +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
