public class Factory {
    public ElectronicDevice createDevice(ElectronicDevice.type type) {
        switch (type) {
            case SMARTPHONE -> {
                return new Smartphone();
            }
            case TABLET -> {
                return new Tablet();
            }
            case LAPTOP -> {
                return new Laptop();
            }
        }
        return null;
    }
}


