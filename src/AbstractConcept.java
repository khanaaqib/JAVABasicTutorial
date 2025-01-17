abstract class car{
    public abstract void speedLimit();

    public void playMusic(){

    }
}

abstract class WagonR extends car{
    public void SpeedLimit(){
        System.out.println("driving speed 80.....");
    }
}


abstract class XUV extends car{
    public void SpeedLimit(){
        System.out.println("driving speed 100.....");
    }
}

public class AbstractConcept {
    public static void main(String [] args){

    }
}
