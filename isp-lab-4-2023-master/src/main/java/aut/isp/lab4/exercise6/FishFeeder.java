package aut.isp.lab4.exercise6;

public class FishFeeder {

    private String manufacturer;
    private String model;
    private int meals;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMeals() {
        return meals;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public void feed(){
        meals--;
        System.out.println("The fish has been fed by its creator");
        if(meals == 0){
            fillUp();
        }
    }

    public void fillUp() {
        meals = 14;
        System.out.println("The feeder has been filled");
    }
    public String toString(){
        return "Model: " + getModel() + " Manufacturer: " + getManufacturer() + " Meals " + getMeals();
    }

}
