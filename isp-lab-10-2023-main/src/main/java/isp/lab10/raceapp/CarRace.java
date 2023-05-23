package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;

public class CarRace extends Thread{
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);

        PlaySound sound = new PlaySound();
        sound.playSound();

        SemaphorePanel semaphorePanel = new SemaphorePanel();
        frame.getContentPane().add(semaphorePanel);

        frame.setLayout(new GridLayout(1, 2));
        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        Car car1 = new Car("Red car", carPanel, semaphoreThread);
        Car car2 = new Car("Blue car", carPanel, semaphoreThread);
        Car car3 = new Car("Green car", carPanel, semaphoreThread);
        Car car4 = new Car("Yellow car", carPanel, semaphoreThread);

        try {
            car1.start();
            car2.start();
            car3.start();
            car4.start();

            car1.join();
            car2.join();
            car3.join();
            car4.join();

            sound.stopSound();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Car extends Thread {
    private String name;
    private int distance = 0;
    private CarPanel carPanel;
    private SemaphoreThread semaphoreThread;

    public Car(String name, CarPanel carPanel, SemaphoreThread semaphoreThread) {
        //set thread name;
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
        while (distance < 400) {
            // simulate the car moving at a random speed
            int speed = (int) (Math.random() * 10) + 1;
            distance += speed;

            carPanel.updateCarPosition(name, distance);

            try {
                // pause for a moment to simulate the passage of time
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        carPanel.carFinished(name);
    }
}

class CarPanel extends JPanel {
    private int[] carPositions;
    private String[] carNames;
    private Color[] carColors;

    public CarPanel() {
        carPositions = new int[4];
        carNames = new String[]{"Red car", "Blue car", "Green car", "Yellow car"};
        carColors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            int yPos = 50 + i * 50; // Vertical position of the car
            int xPos = carPositions[i]; // Horizontal position of the car
            int carSize = 30; // Size of the car

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

    public void carFinished(String carName) {
        System.out.println(carName+" finished race.");
    }

    private int getCarIndex(String carName) {
        for (int i = 0; i < 4; i++) {
            if (carNames[i].equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    public class Race {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Car race");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(1,2));
            SemaphorePanel semaphorePanel = new SemaphorePanel();

            frame.getContentPane().add(semaphorePanel);
            frame.pack();
            frame.setVisible(true);
            SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
            semaphoreThread.start();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CarPanel carPanel = new CarPanel();

            frame.getContentPane().add(carPanel);
            frame.pack();
            frame.setSize(500,300);
            frame.setVisible(true);

        }
    }

}
