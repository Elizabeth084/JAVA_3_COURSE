abstract class SmartDevice {
    public void turnOn() {
        System.out.println(getDeviceType() + " включается");
    }

    public void turnOff() {
        System.out.println(getDeviceType() + " выключается");
    }

    protected abstract String getDeviceType();

    public final void controlDevice() {
        checkSecurity();
        turnOn();
        doAction();
        turnOff();
    }

    protected abstract void doAction();

    private void checkSecurity() {
        System.out.println("Проверка безопасности перед контролем " + getDeviceType());

    }
}
