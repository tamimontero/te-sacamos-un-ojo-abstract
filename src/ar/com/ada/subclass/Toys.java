package ar.com.ada.subclass;

import ar.com.ada.abs.Products;

import java.util.Objects;

public class Toys extends Products {
    protected static Integer quantity = 0;

    public Toys(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public static void addToQuantity() {
        Toys.quantity++;
    }

    @Override
    public void calculateDiscount() {
        if (quantity >= 3 || price >= 3000) {
            discountedPrice = price * 0.75;
        }
    }

    @Override
    public String toString() {
        return "Toys{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Toys toys = (Toys) o;
        return Objects.equals(productName, toys.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity);
    }
}
