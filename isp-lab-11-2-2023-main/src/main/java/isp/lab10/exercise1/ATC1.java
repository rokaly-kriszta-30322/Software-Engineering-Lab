package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ATC1 {
    List<Aircraft> aircraftList = new ArrayList<>();
    public void addAircraft(Aircraft a){
        aircraftList.add(a);
    }
    public void showAircrafts(List<Aircraft> aircraftList){
        for(Aircraft i:aircraftList){
            System.out.println(i);
        }
    }

    public void sendCommand(String aircraftId, AtcCommand1 cmd){
        aircraftList.forEach((a)->{
            if (a.id.equals(aircraftId)){
                a.receiveAtcCommand(cmd);
                synchronized (a){
                    a.notify();
                }
            }
        });
    }

}
