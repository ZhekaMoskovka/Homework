package Homework8_3;

public class Price {
    public String productName;
    public String shopName;
    double price;

    public Price(String productName, String shopName, double price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getShopName() {
        return shopName;
    }
}