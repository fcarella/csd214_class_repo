//package csd214.ai.bookstore.lab1;

// Assume a package for organization
package csd214.f25.lab1.pojos;

// <<interface>> Serializable
// we are going to use java's serializable interface, this is here for documentation purposes only
//interface Serializable {
//    // Typically a marker interface, or could have methods if specified
//}

class CashTill {
    private double runningTotal;

    public CashTill() {
        this.runningTotal = 0.0;
    }

    public void showTotal() {
        System.out.println("Current Till Total: $" + String.format("%.2f", runningTotal));
    }

    public void sellItem(SaleableItem item) { // Association with SaleableItem
        if (item != null) {
            System.out.println("\n--- Processing Sale via Cash Till ---");
            item.sellItem(); // Polymorphic call
            this.runningTotal += item.getPrice();
            System.out.println("Added $" + String.format("%.2f", item.getPrice()) + " to till.");
            showTotal();
            System.out.println("--- End Sale ---");
        } else {
            System.err.println("Cannot sell a null item.");
        }
    }

    public double getRunningTotal() {
        return runningTotal;
    }
}

