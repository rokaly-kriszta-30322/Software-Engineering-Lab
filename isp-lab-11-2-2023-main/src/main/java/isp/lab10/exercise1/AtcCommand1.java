package isp.lab10.exercise1;

public class AtcCommand1 {
}

class TakeOffCommand extends AtcCommand1{
    int altitude;
    public TakeOffCommand(int altitude){
        this.altitude = altitude;
    }
}


class LandCommand extends AtcCommand1{

}
