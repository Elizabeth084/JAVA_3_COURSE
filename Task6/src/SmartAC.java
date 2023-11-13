class SmartAC extends SmartDevice {
    @Override
    protected String getDeviceType() {
        return "Умный кондиционер";
    }

    @Override
    protected void doAction() {
        System.out.println("Установка температуры кондиционера");
    }
}
