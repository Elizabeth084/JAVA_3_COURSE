public class Main {
    public static void main(String[] args){
        Factory factory = new Factory();

        // Создание смартфона и его использование
        ElectronicDevice smartphone = factory.createDevice(ElectronicDevice.type.SMARTPHONE);
        smartphone.turnOn();
        smartphone.turnOff();

        // Создание планшета и его использование
        ElectronicDevice tablet = factory.createDevice(ElectronicDevice.type.TABLET);
        tablet.turnOn();
        tablet.turnOff();

        // Создание ноутбука и его использование
        ElectronicDevice laptop = factory.createDevice(ElectronicDevice.type.LAPTOP);
        laptop.turnOn();
        laptop.turnOff();

    }
}
