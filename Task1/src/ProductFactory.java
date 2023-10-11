import java.util.Map;
import java.util.Scanner;

public class ProductFactory {
    public void createProduct(Product.Type type){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String description = in.nextLine();
        double price = in.nextDouble();
        String nothing = in.nextLine();{
        switch (type) {
            case CLOTHES -> {
                String size = in.nextLine();
                String color = in.nextLine();
                Clothes clothes= new Clothes(name, description, price, size, color);
                    clothes.displayInfo();
            }
            case SHOES-> {
                String size = in.nextLine();
                String brand = in.nextLine();
                Shoes shoes = new Shoes(name, description, price, size, brand);
                shoes.displayInfo();
            }
            case ELECTRONICS-> {
                String brand = in.nextLine();
                String model = in.nextLine();
                Electronics electronics = new Electronics(name, description, price, brand, model);
                electronics.displayInfo();
            }
            default ->
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
}

