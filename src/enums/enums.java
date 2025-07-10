package enums;
enum enums {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int code;

    enums (int code) {
        this.code = code;
    }

    // Method to get enum value
    public int getCode() {
        return this.code;
    }

    // Custom method
    public String getDescription() {
        switch (this) {
            case LOW:
                return "Low Level - Basic";
            case MEDIUM:
                return "Medium Level - Moderate";
            case HIGH:
                return "High Level - Advanced";
            default:
                return "Unknown";
        }
    }
}

