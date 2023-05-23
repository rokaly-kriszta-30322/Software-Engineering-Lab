package isp.lab4.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel;

    @Override
    public void charge(int durationInMinutes) {
        for (int i = 0; i < durationInMinutes; ++i) {
            if (batteryLevel < 100 && i % 10 == 0 && batteryLevel + 10 < 100) {
                batteryLevel += 10;
            }
        }
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }
}
