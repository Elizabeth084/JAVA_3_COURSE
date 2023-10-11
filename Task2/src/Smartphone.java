public class Smartphone extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Смартфон включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Смартфон выключен.");
    }
}
