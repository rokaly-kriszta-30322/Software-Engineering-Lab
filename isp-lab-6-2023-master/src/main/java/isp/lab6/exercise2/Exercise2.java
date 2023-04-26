package isp.lab6.exercise2;

import isp.lab6.exercise1.Exercise1;

import java.util.*;

public class Exercise2 {

    private static Set<Vehicle> vehicles = new HashSet<>();

    public static void main(String[] args) {

        addVehicle("VIN1", "LP1", "Make1", "Model1", 2021);
        addVehicle("VIN2", "LP2", "Make2", "Model2", 2022);
        addVehicle("VIN3", "LP3", "Make3", "Model3", 2023);
        displayVehicles();
        removeVehicle("VIN2");
        displayVehicles();
        checkVehicle("VIN1");
        checkVehicle("VIN2");

    }

    private static void addVehicle(String VIN, String licensePlate, String make, String model, int year) {
        Vehicle vehicle = new Vehicle(VIN, licensePlate, make, model, year);
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("Vehicle added to registry.");
        } else {
            System.out.println("Vehicle already exists in registry.");
        }
    }

    public static void removeVehicle(String VIN) {
        vehicles.removeIf(vehicle -> vehicle.getVIN().equals(VIN));
    }

    public static void checkVehicle(String VIN){
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(VIN)) {
                System.out.println("Exists");
                return;
            }
        }
        System.out.println("Doesn't exist");
    }

    public static void displayVehicles(){
        for (Vehicle vehicle : vehicles) {
            System.out.println("VIN: " + vehicle.getVIN() + ", license: " + vehicle.getLicensePlate() + ", make: " + vehicle.getMake() + ", model: " + vehicle.getModel() + ", year: " + vehicle.getYear());

            }
        }


    private static class Vehicle{

        private String VIN;
        private String licensePlate;
        private String make;
        private String model;
        private int year;

        public Vehicle(String VIN, String licensePlate, String make, String model, int year) {
            this.VIN = VIN;
            this.licensePlate = licensePlate;
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getVIN() {
            return VIN;
        }

        public void setVIN(String VIN) {
            this.VIN = VIN;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

}
