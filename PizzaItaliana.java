

import edu.pizza.base.Topping;

public class PizzaItaliana extends Pizza {

    private static String salsa;

    public PizzaItaliana(String name, double price, String salsa, Topping... toppings) {
        super(name, price, toppings);
        this.salsa = salsa;
    }

    public static String getSalsa() {
        return salsa;


    }
}