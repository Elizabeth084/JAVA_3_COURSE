 class IOS extends MobileOS {
     public IOS(Device device) {
         super(device);
     }

     @Override
     public void run() {
         System.out.println("iOS запущена на устройстве.");
         device.start();
     }
}
