public class Main {
    public static void main(String[] args) {
        // Create a cart with a maximum number of elements - 6
        CartStack cart = new CartStack(6);

        // Add 5-6 objects of the Item class to the cart
        cart.push(new Item("Item 1", 100.0f));
        cart.push(new Item("Item 2", 250.0f));
        cart.push(new Item("Item 3", 50.0f));
        cart.push(new Item("Item 4", 300.0f));
        cart.push(new Item("Item 5", 150.0f));

        // Output the total price of items in the cart
        System.out.println("Total price of items: " + cart.totalPrice());

        // Increase the prices in the cart by 15%
        cart.increasePrices(15.0f);
        // Output the modified total price of items after the increase
        System.out.println("Total price after increasing by 15%: " + cart.totalPrice());

        // Decrease the prices in the cart by 30%
        cart.decreasePrices(30.0f);
        // Output the modified total price of items after the decrease
        System.out.println("Total price after decreasing by 30%: " + cart.totalPrice());
    }
}
