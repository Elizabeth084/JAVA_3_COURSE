public class Main {
    public static void main(String[] args) {

        Building building = new Building("Жилой дом", 5);

        building.setType("Офисное здание");
        building.setFloors(10);

        building.printDetails();
    }
}