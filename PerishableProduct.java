// Aziz Mohmand
// 2024-07-26
// PerishableProduct class for a retail store management system.

import java.util.Date;

public class PerishableProduct extends Product {
    private Date expiryDate;

    // Default constructor
    public PerishableProduct() {
        super();
        this.expiryDate = new Date();
    }

    // Parameterized constructor
    public PerishableProduct(long sku, String name, double unitCost, double salePrice, int quantityOnHand, int quantityNeeded, String specialInstructions, Date expiryDate) {
        super(sku, name, unitCost, salePrice, quantityOnHand, quantityNeeded, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Getter and Setter for expiry date
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Overridden display method
    @Override
    public String toString() {
        return super.toString() + "\nExpiry Date: " + expiryDate;
    }
}
