class SmartLock extends SmartDevice {
    @Override
    protected String getDeviceType() {
        return "Умный дверной замок";
    }

    @Override
    protected void doAction() {
        System.out.println("Запирание/отпирание двери");
    }
}
