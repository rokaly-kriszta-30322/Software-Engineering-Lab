package isp.lab10.exercise1;

import java.sql.SQLOutput;

public class Aircraft implements Runnable{

    String id;
    int altitude;

    public Aircraft(String id){
        this.id=id;
    }

    public void receiveAtcCommand(AtcCommand1 cmd){
        if (cmd instanceof TakeOffCommand) {
            this.altitude = ((TakeOffCommand) cmd).altitude;
        }
        else if (cmd instanceof LandCommand){

        }
    }

    public void run() {
        System.out.println("on stand");
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("taxing");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("taking off");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("ascending");
        for (int currentAltitude = 0; currentAltitude < altitude; currentAltitude += 1000) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("cruising");
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("descending");
        for (int currentAltitude = altitude; currentAltitude > 0; currentAltitude -= 1000) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("landed");
    }

    public static void main(String[] args) throws InterruptedException{
        Aircraft a = new Aircraft("id");
        a.altitude = 3000;
        new Thread(a).start();
    }
}
