package ar.com.ada.abs;

import java.util.Objects;

public abstract class Products {
    protected String productName;
    protected Double price;
    protected Double discountedPrice = 0.0;

    public Products() {}
    public Products(String productName, Double price) {}
    public Products(String productName, Double price, Double discountedPrice) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscountedPrice() {
        calculateDiscount();
        return discountedPrice;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        discountedPrice = discountedPrice;
    }
    public abstract void calculateDiscount();

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", discountedPrice=" + discountedPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productName, products.productName) &&
                Objects.equals(price, products.price) &&
                Objects.equals(discountedPrice, products.discountedPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, discountedPrice);
    }
}
