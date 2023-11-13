class SmartLamp extends SmartDevice{
    @Override
    protected String getDeviceType() {
        return "Умная лампа";
    }

    @Override
    protected void doAction() {
        System.out.println("Регулировка яркости лампы");
    }
}
