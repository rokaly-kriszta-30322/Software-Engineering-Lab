package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController a;
        a = new AquariumController();
        a.setModel("Unique");
        a.setManufacturer("Me");
        a.setCurrentTime(3.1f);
        System.out.println(a.toString());
    }
}
