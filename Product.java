// Aziz Mohmand
// 2024-07-26
// Product class for a retail store management system.

public class Product {
    private long sku;
    private String name;
    private double unitCost;
    private double salePrice;
    private int quantityOnHand;
    private int quantityNeeded;
    private String specialInstructions;

    // Default constructor
    public Product() {
        this(10000000L, "Default Product", 0.0, 0.0, 0, 0, "");
    }

    // Parameterized constructor
    public Product(long sku, String name, double unitCost, double salePrice, int quantityOnHand, int quantityNeeded, String specialInstructions) {
        setSku(sku);
        setName(name);
        setUnitCost(unitCost);
        setSalePrice(salePrice);
        setQuantityOnHand(quantityOnHand);
        setQuantityNeeded(quantityNeeded);
        setSpecialInstructions(specialInstructions);
    }

    // Getters and Setters
    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        if (String.valueOf(sku).matches("\\d{8,}")) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("SKU must be 8 or more digits.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        if (unitCost >= 0) {
            this.unitCost = unitCost;
        } else {
            throw new IllegalArgumentException("Unit cost must be >= 0.");
        }
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        if (salePrice >= 0) {
            this.salePrice = salePrice;
        } else {
            throw new IllegalArgumentException("Sale price must be >= 0.");
        }
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        if (quantityOnHand >= 0) {
            this.quantityOnHand = quantityOnHand;
        } else {
            throw new IllegalArgumentException("Quantity on hand must be >= 0.");
        }
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        if (quantityNeeded >= 0) {
            this.quantityNeeded = quantityNeeded;
        } else {
            throw new IllegalArgumentException("Quantity needed must be >= 0.");
        }
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Display method
    public String toString() {
        return "SKU: " + sku + "\n" +
                "Product Name: " + name + "\n" +
                "Unit Cost: $" + unitCost + "\n" +
                "Sale Price: $" + salePrice + "\n" +
                "Quantity on hand: " + quantityOnHand + "\n" +
                "Quantity Needed: " + quantityNeeded + "\n" +
                "Special Instructions: " + specialInstructions;
    }
}
