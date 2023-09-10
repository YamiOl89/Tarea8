

import edu.pizza.base.Topping;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la pizzería las delicias!");
        System.out.println("Por favor, elija una de las siguientes opciones:");
        System.out.println("Cuando elijas una opcion se agregaran los Toppings con sus precios!");

        while (true) {
            System.out.println("1. Pizza Margherita");
            System.out.println("2. Pizza Italiana");
            System.out.println("3. Pizza Personalizada");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hacerPizzaMargherita();
                    break;
                case 2:
                    hacerPizzaItaliana();

                    break;
                case 3:
                    hacerPizzaPersonalizada();
                    break;
                case 4:
                    System.out.println("Gracias por visitar Pizzeria House. ¡Hasta la próxima!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }

    private static void hacerPizzaItaliana() {
        // Código para hacer una pizza Italiana según tu descripción
        System.out.println("Preparando una Pizza Italiana...");
        Pizza pizza = new Pizza("pizza Italiana", 10.00);
        pizza.addTopping(new Topping("Tomato", 40.00));
        pizza.addTopping(new Topping("Mozzarella", 25.00));
        pizza.addTopping(new Topping("Basil", 10.00));
        pizza.prepare();
        System.out.println("¡Pizza Italiana lista para disfrutar!");
    }

    public static void hacerPizzaMargherita() {
        // Código para hacer una pizza Margherita según tu descripción
        System.out.println("Preparando una Pizza Margherita...");
        Pizza pizza = new Pizza("pizza Margherita", 10.00);
        pizza.addTopping(new Topping("Tomato", 40.00));
        pizza.addTopping(new Topping("Mozzarella", 25.00));
        pizza.addTopping(new Topping("Basil", 10.00));
        pizza.prepare();
        System.out.println("¡Pizza Margherita lista para disfrutar!");
    }

    public static void hacerPizzaPersonalizada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Personaliza tu Pizza:");
        System.out.println("Elige el tamaño de la pizza:");
        System.out.println("1. Pizza Pequeña");
        System.out.println("2. Pizza Mediana");
        System.out.println("3. Pizza Grande");

        int tipoPizza = scanner.nextInt();
        double toppingPrecio = 0;
        double precioPizza = 0;
        double precioTotal = toppingPrecio + precioPizza;

        switch (tipoPizza) {
            case 1:
                precioPizza = 70; // Precio fijo para pizza pequeña
                break;
            case 2:
                precioPizza = 90; // Precio fijo para pizza mediana
                break;
            case 3:
                precioPizza = 120; // Precio fijo para pizza grande
                break;
            default:
                System.out.println("Opción no válida. Seleccionando pizza pequeña por defecto.");
                precioPizza = 7.99; // Precio fijo predeterminado para pizza pequeña
                break;
        }

        System.out.println("Has elegido una pizza. El precio base es: $" + precioPizza);
        System.out.println("Ahora, personaliza tu pizza con los Toppings. Ingresa 0 para terminar.");

        Pizza pizzaPersonalizada = new Pizza("Pizza Personalizada", precioPizza);

        while (true) {
            System.out.print("Ingresa el nombre del Topping (o 0 para terminar): ");
            String toppingNombre = scanner.next();

            if (toppingNombre.equals("0")) {
                break;
            }

            System.out.print("Ingresa el precio del Topping: ");
            toppingPrecio = scanner.nextDouble();

            pizzaPersonalizada.addTopping(new Topping(toppingNombre, toppingPrecio));
            // No necesitas sumar el precio del topping aquí, ya que se suma automáticamente al precio de la pizza.
        }

        pizzaPersonalizada.prepare();
        precioTotal = toppingPrecio + precioPizza;
        System.out.println("¡Pizza Personalizada lista para disfrutar! Precio total: $" + precioTotal);
    }
}