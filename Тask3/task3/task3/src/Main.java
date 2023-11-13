//Создать программу для управления мобильными операционными системами различными типами (iOS, Android, HarmonyOS) с использованием шаблона «мост».
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Device smartphone = new Smartphone();
        Device tablet = new Tablet();
        Device smartWatch = new SmartWatch();

        List<MobileOS> mobileOSList = new ArrayList<>();
        mobileOSList.add(new IOS(smartphone));
        mobileOSList.add(new Android(tablet));
        mobileOSList.add(new HarmonyOS(smartWatch));

        for (MobileOS item : mobileOSList) {
            item.run();
        }
    }
}