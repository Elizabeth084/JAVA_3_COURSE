public class Shoes extends Product {
    private String size;
    private String brand;

    public Shoes(String name, String description, double price, String size, String brand) {
        super(name, description, price);
        this.size = size;
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
    }
}
