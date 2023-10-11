public abstract class Product {
    private final String name;
    private final String description;
    private final double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    enum Type{
        CLOTHES,
        SHOES,
        ELECTRONICS;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}
