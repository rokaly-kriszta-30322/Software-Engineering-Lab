package isp.lab10.exercise1;

import java.util.Scanner;
public class Exercise11 {

    public static void main(String[] args) throws InterruptedException{
        Aircraft a = new Aircraft("air-001");
        a.altitude = 3000;
        //new Thread(a).start();
        Thread aircraftThread = new Thread(a);
        aircraftThread.start();

        Thread.sleep(20000);
        AtcCommand1 cmd = new TakeOffCommand(3000);
        AtcCommand1 cmd2 = new LandCommand();
        ATC1 controlTower = new ATC1();
        controlTower.addAircraft(a);
        controlTower.sendCommand("air-001",cmd);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        controlTower.sendCommand("air-001", cmd2);

        aircraftThread.join();

    }

}
