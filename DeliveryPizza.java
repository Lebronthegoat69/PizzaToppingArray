public class DeliveryPizza extends Pizza {

    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numberOfToppings) {
        super(toppings, numberOfToppings);

        this.deliveryAddress = deliveryAddress;

        if (getPrice() > 18) {
            deliveryFee = 3;
        } else {
            deliveryFee = 5;
        }
    }

    @Override
    public String toString() {
        double totalCost = getPrice() + deliveryFee;

        return getDescription()
                + "\nPizza Price: $" + String.format("%.2f", getPrice())
                + "\nDelivery Address: " + deliveryAddress
                + "\nDelivery Fee: $" + String.format("%.2f", deliveryFee)
                + "\nTotal Cost: $" + String.format("%.2f", totalCost);
    }
}