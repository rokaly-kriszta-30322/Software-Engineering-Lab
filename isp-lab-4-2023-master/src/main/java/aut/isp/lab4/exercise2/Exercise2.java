package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder f;
        f = new FishFeeder();
        f.setModel("Unique");
        f.setManufacturer("Me");
        f.setMeals(1);
        System.out.println(f.toString());
        f.feed();
    }
}
