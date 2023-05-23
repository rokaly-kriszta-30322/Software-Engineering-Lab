package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        MonitoringService monitoringService = new MonitoringService();

        TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        temperatureSensor1.setTemperature(20);
        monitoringService.addSensor(temperatureSensor1);

        TemperatureSensor temperatureSensor2 = new TemperatureSensor();
        temperatureSensor2.setTemperature(30);
        monitoringService.addSensor(temperatureSensor2);

        PressureSensor pressureSensor1 = new PressureSensor();
        pressureSensor1.setPressure(1000);
        monitoringService.addSensor(pressureSensor1);

        double averageTemperature = monitoringService.getAverageTemperatureSensors();
        System.out.println("Average Temperature: " + averageTemperature);

        double averageAllSensors = monitoringService.getAverageAllSensors();
        System.out.println("Average Value from All Sensors: " + averageAllSensors);
    }
}

