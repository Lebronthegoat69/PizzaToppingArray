public class Pizza {

    private String[] toppings;
    private double price;
    private String description;

    public Pizza(String[] toppings, int numberOfToppings) {
        this.toppings = toppings;

        description = "Toppings: ";

        for (int i = 0; i < numberOfToppings; i++) {
            description += toppings[i];

            if (i < numberOfToppings - 1) {
                description += ", ";
            }
        }

        price = 14 + (2 * numberOfToppings);
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + "\nPizza Price: $" + String.format("%.2f", price);
    }
}