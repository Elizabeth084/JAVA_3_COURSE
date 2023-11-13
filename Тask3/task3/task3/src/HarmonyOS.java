 class HarmonyOS extends MobileOS {
     public HarmonyOS(Device device) {
         super(device);
     }

     @Override
     public void run() {
         System.out.println("HarmonyOS запущена на устройстве.");
         device.start();
     }
}
