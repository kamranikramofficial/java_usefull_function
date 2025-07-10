package GenericsAndDiamondOperators;

public class GenericTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("Value: " + stringBox.getValue());

        Box<Integer> intBox = new Box<>(100); // Diamond operator auto-detects Integer
        System.out.println("Value: " + intBox.getValue());

        // Using generic method
        boolean result = Util.isEqual("test", "test");
        System.out.println("Are equal? " + result);
    }
}