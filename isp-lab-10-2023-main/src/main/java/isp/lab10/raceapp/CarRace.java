package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CarRace {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        CarPanel carPanel = new CarPanel();
        frame.getContentPane().add(carPanel);

        SemaphorePanel semaphorePanel = new SemaphorePanel();
        frame.getContentPane().add(semaphorePanel);

        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);

        PlaySound sound = new PlaySound();
        sound.playSound();

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        Car car1 = new Car("Red car", carPanel, semaphoreThread);
        Car car2 = new Car("Blue car", carPanel, semaphoreThread);
        Car car3 = new Car("Green car", carPanel, semaphoreThread);
        Car car4 = new Car("Yellow car", carPanel, semaphoreThread);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        car1.join();
        car2.join();
        car3.join();
        car4.join();

        sound.stopSound();
    }
}

class Car extends Thread {
    private String name;
    private int distance = 0;
    private CarPanel carPanel;
    private SemaphoreThread semaphoreThread;
    private long raceStartTime;

    public Car(String name, CarPanel carPanel, SemaphoreThread semaphoreThread) {
        setName(name);
        this.name = name;
        this.carPanel = carPanel;
        this.semaphoreThread = semaphoreThread;
    }

    public void run() {
        try {
            semaphoreThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        raceStartTime = System.currentTimeMillis();

        while (distance < 400) {
            int speed = (int) (Math.random() * 10) + 1;
            distance += speed;

            carPanel.updateCarPosition(name, distance);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long individualRaceTime = System.currentTimeMillis() - raceStartTime;
        carPanel.carFinished(name, individualRaceTime);
    }
}

class CarPanel extends JPanel {
    private int[] carPositions;
    private String[] carNames;
    private Color[] carColors;
    private Map<String, Long> carRaceTimes;
    private int finishedCount;

    public CarPanel() {
        carPositions = new int[4];
        carNames = new String[]{"Red car", "Blue car", "Green car", "Yellow car"};
        carColors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        carRaceTimes = new HashMap<>();
        finishedCount = 0;
    }

    public void displayStandings() {
        System.out.println("Race Standings:");

        for (int i = 0; i < 4; i++) {
            int maxPosition = -1;
            int carIndex = -1;

            for (int j = 0; j < 4; j++) {
                if (carPositions[j] > maxPosition) {
                    maxPosition = carPositions[j];
                    carIndex = j;
                }
            }

            System.out.println((i + 1) + ". " + carNames[carIndex]);

            carPositions[carIndex] = -1;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            int yPos = 50 + i * 50;
            int xPos = carPositions[i];
            int carSize = 30;

            g.setColor(carColors[i]);
            g.fillOval(xPos, yPos, carSize, carSize);
            g.setColor(Color.BLACK);
            g.drawString(carNames[i], xPos, yPos - 5);
        }
    }

    public void updateCarPosition(String carName, int distance) {
        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            carPositions[carIndex] = distance;
            repaint();
        }
    }

    public void carFinished(String carName, long individualRaceTime) {
        System.out.println(carName + " finished race.");

        int carIndex = getCarIndex(carName);
        if (carIndex != -1) {
            carPositions[carIndex] = 400;
            carRaceTimes.put(carName, individualRaceTime);
            finishedCount++;

            if (finishedCount == 4) {
                displayStandings();

                long raceDuration = System.currentTimeMillis() - carRaceTimes.get(carNames[0]);
                System.out.println("Race Duration: " + raceDuration + " milliseconds");

                for (String name : carNames) {
                    long individualRaceDuration = carRaceTimes.get(name);
                    System.out.println(name + " Race Duration: " + individualRaceDuration + " milliseconds");
                }
            }
        }
    }

    private int getCarIndex(String carName) {
        for (int i = 0; i < 4; i++) {
            if (carNames[i].equals(carName)) {
                return i;
            }
        }
        return -1;
    }
}
