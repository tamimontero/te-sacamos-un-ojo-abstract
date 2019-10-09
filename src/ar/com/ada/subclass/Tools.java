package ar.com.ada.subclass;

import ar.com.ada.abs.Products;

import java.util.Objects;

public class Tools extends Products {
    protected static String typeOfPayment;

    public Tools(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public static String getTypeOfPayment() {
        return typeOfPayment;
    }

    public static void setTypeOfPayment(String typeOfPayment) {
        Tools.typeOfPayment = typeOfPayment;
    }

    @Override
    public void calculateDiscount() {
        if (typeOfPayment.equals("TDC")) {
            discountedPrice = price * 0.95;
        }
    }

    @Override
    public String toString() {
        return "Tools{" +
                "typeOfPayment='" + typeOfPayment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tools tools = (Tools) o;
        return Objects.equals(typeOfPayment, tools.typeOfPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfPayment);
    }
}
