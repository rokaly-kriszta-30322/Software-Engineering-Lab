package isp.lab4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public double getAverageTemperatureSensors() {
        double sum = 0;
        int count = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum += temperatureSensor.getTemperature();
                count++;
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    public double getAverageAllSensors() {
        double sum = 0;
        int count = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof PressureSensor) {
                PressureSensor pressureSensor = (PressureSensor) sensor;
                sum += pressureSensor.getPressure();
                count++;
            } else if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum += temperatureSensor.getTemperature();
                count++;
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }
}

