public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, String description, double price, String brand, String model) {
        super(name, description, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

