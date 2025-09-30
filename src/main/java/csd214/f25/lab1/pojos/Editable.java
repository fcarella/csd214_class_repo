//package csd214.ai.bookstore.lab1;

// Assume a package for organization
package csd214.f25.lab1.pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// <<interface>> Serializable
// we are going to use java's serializable interface, this is here for documentation purposes only
//interface Serializable {
//    // Typically a marker interface, or could have methods if specified
//}

// <<abstract>> Editable
abstract class Editable implements Serializable {
    private Scanner input = new Scanner(System.in); // Shared scanner

    // Concrete utility method
    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return input.nextLine();
    }

    // The diagram shows these overloaded getInput methods.
    // They all return String, implying they take a prompt related to the type.
    public String getInput(int exampleIntValueToPromptFor) {
        return getInput("Enter integer value (e.g., " + exampleIntValueToPromptFor + ")");
    }

    public String getInput(double exampleDoubleValueToPromptFor) {
        return getInput("Enter double value (e.g., " + exampleDoubleValueToPromptFor + ")");
    }

    public String getInput(boolean exampleBooleanValueToPromptFor) {
        return getInput("Enter boolean value (true/false) (e.g., " + exampleBooleanValueToPromptFor + ")");
    }

    public String getInput(Date exampleDateValueToPromptFor) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return getInput("Enter date value (YYYY-MM-DD) (e.g., " + (exampleDateValueToPromptFor != null ? sdf.format(exampleDateValueToPromptFor) : "any date") + ")");
    }

    public String getInput(Enum<?> exampleEnumValueToPromptFor) {
        return getInput("Enter enum value (e.g., " + (exampleEnumValueToPromptFor != null ? exampleEnumValueToPromptFor.name() : "any enum constant") + ")");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void edit();
    public abstract void initialize();
}

