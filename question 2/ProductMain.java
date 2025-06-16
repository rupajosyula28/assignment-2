import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spent
    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept 5 products from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        double maxPrice = products[0].price;
        int maxPricePid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }

        System.out.println("\nProduct ID with highest price: " + maxPricePid);

        // Calculate total amount spent
        double totalAmount = calculateTotal(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}
