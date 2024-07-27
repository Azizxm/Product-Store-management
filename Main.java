// Aziz Mohmand
// 2024-07-26
// Main program for retail store management system.

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1) Create Product");
            System.out.println("2) Create Perishable Product");
            System.out.println("3) Edit Product by SKU");
            System.out.println("4) Delete Product by SKU");
            System.out.println("5) Display Product by SKU");
            System.out.println("6) Display all Products");
            System.out.println("7) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createProduct(scanner);
                    break;
                case 2:
                    createPerishableProduct(scanner);
                    break;
                case 3:
                    editProductBySku(scanner);
                    break;
                case 4:
                    deleteProductBySku(scanner);
                    break;
                case 5:
                    displayProductBySku(scanner);
                    break;
                case 6:
                    displayAllProducts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void createProduct(Scanner scanner) {
        // Implementation to create a new Product and add to productList
        // including validation for each field.
    }

    private static void createPerishableProduct(Scanner scanner) {
        // Implementation to create a new PerishableProduct and add to productList
        // including validation for each field.
    }

    private static void editProductBySku(Scanner scanner) {
        // Implementation to edit a Product by SKU
    }

    private static void deleteProductBySku(Scanner scanner) {
        // Implementation to delete a Product by SKU
    }

    private static void displayProductBySku(Scanner scanner) {
        // Implementation to display a Product by SKU
    }

    private static void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product);
            System.out.println("----------------------");
        }
    }
}
