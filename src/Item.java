public class Item {
    // Field for the item name
    private String name;
    // Field for the item price
    private float price;

    // Constructor that accepts two parameters: item name and initial price
    public Item(String name, float price) {
        this.name = name;
        if (price < 0) {
            this.price = 0; // If the price is negative, set it to 0
        } else {
            this.price = price;
        }
    }

    // Method to increase the price by a certain percentage
    public void increasePrice(float percent) {
        if (percent > 0) {
            price += price * (percent / 100);
        }
    }

    // Method to decrease the price by a certain percentage
    public void decreasePrice(float percent) {
        if (percent > 0) {
            price -= price * (percent / 100);
        }
        // Check if the price becomes negative after the decrease
        if (price < 0) {
            price = 0; // If the price becomes negative, set it to 0
        }
    }

    // Getter to retrieve the item price
    public float getPrice() {
        return price;
    }
}




