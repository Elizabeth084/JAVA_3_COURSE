 class Android extends MobileOS{
     public Android(Device device) {
         super(device);
     }

     @Override
     public void run() {
         System.out.println("Android запущена на устройстве.");
         device.start();
     }
 }
