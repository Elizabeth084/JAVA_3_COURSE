public class Tablet extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Планшет включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Планшет выключен.");
    }
}
