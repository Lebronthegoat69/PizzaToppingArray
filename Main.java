public class Main {

    public static void main(String[] args) {

        System.out.println("Pizza Order Test");
        System.out.println("----------------");
        System.out.println();

        // Regular Pizza
        String[] regularToppings = {"pepperoni", "mushrooms", "onions"};
        Pizza regularPizza = new Pizza(regularToppings, 3);

        System.out.println("Regular Pizza:");
        System.out.println(regularPizza);
        System.out.println();

        // Delivery Pizza with 2 toppings
        String[] deliveryToppings1 = {"sausage", "green peppers"};
        DeliveryPizza deliveryPizza1 =
                new DeliveryPizza(deliveryToppings1, "123 Main Street", 2);

        System.out.println("Delivery Pizza:");
        System.out.println(deliveryPizza1);
        System.out.println();

        // Delivery Pizza with 4 toppings
        String[] deliveryToppings2 = {"pepperoni", "bacon", "onions", "olives"};
        DeliveryPizza deliveryPizza2 =
                new DeliveryPizza(deliveryToppings2, "456 Oak Avenue", 4);

        System.out.println("Delivery Pizza:");
        System.out.println(deliveryPizza2);
    }
}