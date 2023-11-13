class Building {
    private String type;
    private int floors;

    public Building(String type, int floors) {
        this.type = type;
        this.floors = floors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void printDetails() {
        System.out.println("Тип здания: " + type);
        System.out.println("Количество этажей: " + floors);
// Вывод других характеристик здания
    }
}