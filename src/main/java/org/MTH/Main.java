package org.MTH;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        // Adding some names to the repository
        NameRepository.add("John Doe");
        NameRepository.add("Jane Smith");

        // Finding names in the repository
        String foundName1 = NameRepository.find("John Doe");
        String foundName2 = NameRepository.find("Mary Johnson");

        // Outputting the results
        System.out.println("Found Name 1: " + foundName1); // Output: John Doe
        System.out.println("Found Name 2: " + foundName2); // Output: null

        // Adding a name that already exists
        boolean added = NameRepository.add("John Doe");
        System.out.println("Name added: " + added); // Output: false
    }
}
