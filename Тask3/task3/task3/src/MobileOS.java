abstract class MobileOS {
    protected Device device;

    public MobileOS(Device device) {
        this.device = device;
    }

    public abstract void run();
}

