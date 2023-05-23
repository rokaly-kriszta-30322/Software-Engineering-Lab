package isp.lab4.exercise2;

/**
 * @author Radu Miron
 */
public interface Chargeable {
    void charge(int duration);

    int getBatteryLevel();

    void setBatteryLevel(int batteryLevel);
}
