import ar.com.ada.abs.Products;
import ar.com.ada.subclass.Clothing;
import ar.com.ada.subclass.Food;
import ar.com.ada.subclass.Tools;
import ar.com.ada.subclass.Toys;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int choice, i = 0, k = 1;
        String choice2;
        Double totalPriceNoDiscount = 0.0, totalPriceWithDiscount = 0.0;

        Products food1 = new Food("Leche en polvo 'La vaca loca'x 250gr", 285.00);
        Products food2 = new Food("Azúcar 'El ritmo que trae no es' x 1kg", 175.50);
        Products food3 = new Food("Café 'Mas negro que el alma de tu ex' x 275gr", 500.99);

        Products clothing1 = new Clothing("Vestido floreado", 6012.00, "Mujer");
        Products clothing2 = new Clothing("Bermuda lisa", 2600.99, "Hombre");
        Products clothing3 = new Clothing("Remera Looney Toones", 900.00, "Niño");

        Products tools1 = new Tools("Destornillador", 740.93);
        Products tools2 = new Tools("Martillo", 1023.00);
        Products tools3 = new Tools("Taladro Gama con accesorios", 9630.00);

        Products toys1 = new Toys("Auto Rayo McQueen", 8560.00);
        Products toys2 = new Toys("Plastilina tres colores", 225.00);
        Products toys3 = new Toys("R2D2: Arturito, tamaño real", 100300.00);

        ArrayList<Products> arrayFood = new ArrayList<Products>();
        arrayFood.add(food1);
        arrayFood.add(food2);
        arrayFood.add(food3);

        ArrayList<Products> arrayClothing = new ArrayList<Products>();
        arrayClothing.add(clothing1);
        arrayClothing.add(clothing2);
        arrayClothing.add(clothing3);

        ArrayList<Products> arrayTools = new ArrayList<Products>();
        arrayTools.add(tools1);
        arrayTools.add(tools2);
        arrayTools.add(tools3);

        ArrayList<Products> arrayToys = new ArrayList<Products>();
        arrayToys.add(toys1);
        arrayToys.add(toys2);
        arrayToys.add(toys3);

// metodo add es un metodo de la clase array list
// en este caso esta instanciada como array carrito
// y agrega lo que esta entre parentesis
        ArrayList<Products> arrayCarrito = new ArrayList<Products>();

        System.out.println("Bienvenido a la tienda 'Te sacamos un ojo'");
        System.out.println("¡Aquí encontrarás las mejores ofertas del mercado!");
        System.out.println("¿Qué día de la semana es hoy?");
        choice2 = keyboard.next();
        Food.setDayOfTheWeek(choice2);

        do {
            System.out.println("Ingresa la opción deseada: 1-Alimentos 2-Ropa 3-Herramientas 4-Juguetes 9-Finalizar");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("¿Qué alimento de la lista deseas agregar al carrito?");
                    for (int j = 0; j < arrayFood.size(); j++) {
                        System.out.println(j + " " + arrayFood.get(j).getProductName() + " " + arrayFood.get(j).getPrice());
                    }
                    choice = keyboard.nextInt();
                    arrayCarrito.add(arrayFood.get(choice));
                    System.out.println("Se agregó " + arrayFood.get(choice).getProductName() + " al carrito de compras");
                    break;
                case 2:
                    System.out.println("¿Qué prenda de la lista deseas agregar al carrito de compras?");
                    for (int j = 0; j < arrayClothing.size(); j++) {
                        System.out.println(j + " " + arrayClothing.get(j).getProductName() + " " + arrayClothing.get(j).getPrice());
                    }
                    choice = keyboard.nextInt();
                    arrayCarrito.add(arrayClothing.get(choice));
                    System.out.println("Se agregó " + arrayClothing.get(choice).getProductName() + " al carrito de compras");
                    break;
                case 3:
                    System.out.println("¿Qué herramienta de la lista deseas agregar al carrito de compras?");
                    for (int j = 0; j < arrayTools.size(); j++) {
                        System.out.println(j + " " + arrayTools.get(j).getProductName() + " " + arrayTools.get(j).getPrice());
                    }
                    choice = keyboard.nextInt();
                    arrayCarrito.add(arrayTools.get(choice));
                    System.out.println("Se agregó " + arrayTools.get(choice).getProductName() + " al carrito de compras");
                    System.out.println("¿Qué tipo de pago utilizará para abonar su compra?");
                    System.out.println("Recuerde que obtendrá un 5% de descuento en su pago con TDC");
                    String choice1 = keyboard.next();
                    Tools.setTypeOfPayment(choice1);
                    break;
                case 4:
                    System.out.println("¿Qué juguete de la lista deseas agregar al carrito de compras?");
// estoy almacenando en la clase
                    for (int j = 0; j < arrayToys.size(); j++) {
                        System.out.println(j + " " + arrayToys.get(j).getProductName() + " " + arrayToys.get(j).getPrice());
                    }
                    choice = keyboard.nextInt();
                    arrayCarrito.add(arrayToys.get(choice));
                    System.out.println("Se agregó " + arrayToys.get(choice).getProductName() + " al carrito de compras");
                    Toys.addToQuantity();
                    break;
                case 9:
                    k = 0;
                    break;
            }
        } while (k != 0);

        System.out.println("Detalle de su compra:");
        for (int l = 0; l < arrayCarrito.size(); l++) {
            System.out.println(arrayCarrito.get(l).getProductName() + " $" + arrayCarrito.get(l).getPrice() + " " + arrayCarrito.get(l).getDiscountedPrice());
            Products product = arrayCarrito.get(l);
            totalPriceNoDiscount += product.getPrice();
            totalPriceWithDiscount += arrayCarrito.get(l).getDiscountedPrice();
        }

        System.out.println("Total sin descuentos: $" + totalPriceNoDiscount);
        System.out.println("Total a pagar (con dto): $" + totalPriceWithDiscount);
    }
}
