package ar.com.ada.subclass;

import ar.com.ada.abs.Products;

import java.util.Objects;

public class Food extends Products {
    protected static String dayOfTheWeek;

    public Food(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

//    public Food(String productName, Double price) {
//        super(productName, price);
//    }

    public static String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public static void setDayOfTheWeek(String dayOfTheWeek) {
        Food.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public void calculateDiscount() {
        if (dayOfTheWeek.equals("Martes") || dayOfTheWeek.equals("Jueves")) {
            this.discountedPrice = price * 0.9;
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "dayOfTheWeek='" + dayOfTheWeek + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return Objects.equals(dayOfTheWeek, food.dayOfTheWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dayOfTheWeek);
    }
}
