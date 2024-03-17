package org.MTH;
import java.util.ArrayList;
import java.util.List;

public class NameRepository {
   final private static List<String> names = new ArrayList<>();

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null; // Return null if name not found
    }

    public static boolean add(final String fullName) {
        if (names.contains(fullName.toLowerCase())) {
            return false; // Name already exists in the list
        } else {
            names.add(fullName.toLowerCase()); // Add new name to the list
            return true; // Return true when name is added
        }
    }

    // Additional methods can be added here if needed

    public static void main(String[] args) {
        add("John Doe");
        add("Jane Smith");
        System.out.println(find("John Doe")); // Output: John Doe
        System.out.println(find("Mary Johnson")); // Output: null
        System.out.println(add("John Doe")); // Output: false
    }
}
