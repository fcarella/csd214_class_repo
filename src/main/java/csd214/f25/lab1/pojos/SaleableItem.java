//package csd214.ai.bookstore.lab1;

// Assume a package for organization
package csd214.f25.lab1.pojos;

// <<interface>> Serializable
// we are going to use java's serializable interface, this is here for documentation purposes only
//interface Serializable {
//    // Typically a marker interface, or could have methods if specified
//}

// <<interface>> SaleableItem
interface SaleableItem {
    void sellItem(); // Abstract method
    double getPrice(); // Abstract method
}

