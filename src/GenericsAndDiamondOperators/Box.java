package GenericsAndDiamondOperators;

class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }
}

// Generic method to compare two values
class Util {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}