package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Race!");
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

        PlaySound sound = new PlaySound();
        sound.playSound();

        Car car1 = new Car("Red car", carPanel,semaphoreThread);
        Car car2 = new Car("Blue car", carPanel, semaphoreThread);
        Car car3 = new Car("Green car", carPanel,semaphoreThread);
        Car car4 = new Car("Yellow car", carPanel,semaphoreThread);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sound.stopSound();
    }
}
