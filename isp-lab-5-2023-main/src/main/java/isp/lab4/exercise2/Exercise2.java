package isp.lab4.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone();

    smartPhone.setBatteryLevel(10);

    // Print initial battery level
        System.out.println("Initial Battery Level: " + smartPhone.getBatteryLevel());

    // Charge the smartphone for 60 minutes
        smartPhone.charge(60);

    // Print final battery level
        System.out.println("Final Battery Level: " + smartPhone.getBatteryLevel());
}
}

