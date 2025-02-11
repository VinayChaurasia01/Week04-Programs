package generics.onlinemarketplace;

// Clothing Category Class
public class Clothing {
    private String type;
    private String size;

    public Clothing(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size;
    }
}
