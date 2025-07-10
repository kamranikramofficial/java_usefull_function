package enums;

public class EnumsTest {
    public static void main(String[] args) {
        enums currentLevel = enums.LOW;

        // Print enum constant
        System.out.println("Level: " + currentLevel);

        // Access enum method
        System.out.println("Code: " + currentLevel.getCode());

        // Call custom method
        System.out.println("Description: " + currentLevel.getDescription());

        // Loop through all enum values
        for (enums l : enums.values()) {
            System.out.println(l + " - Code: " + l.getCode());
        }
    }
}
