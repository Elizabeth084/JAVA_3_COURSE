public class Clothes extends Product{
    private String size;
    private String color;

    public Clothes(String name, String description, double price, String size, String color) {
        super(name, description, price);
        this.size = size;
        this.color = color;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}
