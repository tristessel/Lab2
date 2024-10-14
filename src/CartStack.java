public class CartStack {
    private Item[] stack;  // Array to store items
    private int top;       // Index of the top element in the stack
    private int maxSize;   // Maximum number of elements in the cart

    // Constructor with a parameter for the maximum number of elements in the stack
    public CartStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Item[maxSize];
        this.top = -1;  // Initialize the top index to -1, indicating an empty stack
    }

    // Method to add an item to the stack
    public boolean push(Item item) {
        if (top == maxSize - 1) {
            System.out.println("Cart is full. Cannot add more items.");
            return false;
        } else {
            stack[++top] = item;  // Add the item and increment the top index
            return true;
        }
    }

    // Method to remove an item from the stack
    public Item pop() {
        if (top == -1) {
            System.out.println("Cart is empty. No items to remove.");
            return null;
        } else {
            return stack[top--];  // Remove the top item and decrement the top index
        }
    }

    // Method to calculate the total price of items in the cart
    public float totalPrice() {
        float sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stack[i].getPrice();  // Sum the prices of all items in the stack
        }
        return sum;
    }

    // Method to increase the prices of all items in the cart
    public void increasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].increasePrice(percent);  // Increase the price of each item
        }
    }

    // Method to decrease the prices of all items in the cart
    public void decreasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].decreasePrice(percent);  // Decrease the price of each item
        }
    }

    // Method to check if the cart is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the cart is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
