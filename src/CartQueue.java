public class CartQueue {
    private Item[] items;  // Array to store items
    private int maxSize;   // Maximum number of elements in the queue
    private int start;     // Index of the front of the queue
    private int end;       // Index of the end of the queue
    private int itemCount; // Number of items in the queue

    // Constructor with a parameter for the maximum number of elements in the queue
    public CartQueue(int maxSize) {
        this.maxSize = maxSize;
        this.items = new Item[maxSize];
        this.start = 0;
        this.end = -1;
        this.itemCount = 0;
    }

    // Method to add an item to the queue
    public boolean push(Item item) {
        if (isFull()) {
            System.out.println("Cart is full. Cannot add more items.");
            return false;
        } else {
            // If the end index reaches the end of the array, reset to the beginning
            if (end == maxSize - 1) {
                end = -1;
            }
            items[++end] = item;  // Add the item at the end of the queue
            itemCount++;
            return true;
        }
    }

    // Method to remove an item from the queue
    public Item pop() {
        if (isEmpty()) {
            System.out.println("Cart is empty. No items to remove.");
            return null;
        } else {
            Item temp = items[start++];  // Remove the item from the front of the queue
            if (start == maxSize) {      // If the start index reaches the end of the array, reset to the beginning
                start = 0;
            }
            itemCount--;
            return temp;
        }
    }

    // Method to calculate the total price of items in the cart
    public float totalPrice() {
        float sum = 0;
        int current = start;
        for (int i = 0; i < itemCount; i++) {
            sum += items[current].getPrice();
            current++;
            if (current == maxSize) {
                current = 0;  // Reset current index if it reaches the end
            }
        }
        return sum;
    }

    // Method to increase the prices of all items in the cart
    public void increasePrices(float percentage) {
        int current = start;
        for (int i = 0; i < itemCount; i++) {
            items[current].increasePrice(percentage);
            current++;
            if (current == maxSize) {
                current = 0;  // Reset current index if it reaches the end
            }
        }
    }

    // Method to decrease the prices of all items in the cart
    public void decreasePrices(float percentage) {
        int current = start;
        for (int i = 0; i < itemCount; i++) {
            items[current].decreasePrice(percentage);
            current++;
            if (current == maxSize) {
                current = 0;  // Reset current index if it reaches the end
            }
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return itemCount == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return itemCount == maxSize;
    }
}
