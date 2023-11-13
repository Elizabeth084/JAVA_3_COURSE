public class SmartDeviceControl {
        public static void main(String[] args) {
                SmartDevice lamp = new SmartLamp();
                SmartDevice ac = new SmartAC();
                SmartDevice lock = new SmartLock();

                System.out.println("Управление умными устройствами:");
                lamp.controlDevice();
                ac.controlDevice();
                lock.controlDevice();
        }
}
