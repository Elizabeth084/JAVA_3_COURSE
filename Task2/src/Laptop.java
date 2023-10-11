public class Laptop extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Ноутбук включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Ноутбук выключен.");
    }
}
