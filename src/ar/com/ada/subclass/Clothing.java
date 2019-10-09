package ar.com.ada.subclass;

import ar.com.ada.abs.Products;

import java.util.Objects;

public class Clothing extends Products {
    protected String typeOfClothing;

    public Clothing(String productName, Double price, String typeOfTheClothing) {
        this.productName = productName;
        this.price = price;
        this.typeOfClothing = typeOfTheClothing;
    }

    public String getTypeOfClothing() {
        return typeOfClothing;
    }

    public void setTypeOfClothing(String typeOfClothing) {
        this.typeOfClothing = typeOfClothing;
    }

    @Override
    public void calculateDiscount() {
        if (typeOfClothing.equals("Mujer") || typeOfClothing.equals("Niño")) {
            discountedPrice = price * 0.85;
        }
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "typeOfClothing='" + typeOfClothing + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothing clothing = (Clothing) o;
        return Objects.equals(typeOfClothing, clothing.typeOfClothing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfClothing);
    }
}
