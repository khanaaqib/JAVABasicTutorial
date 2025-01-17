// class- class --->extends
//class - interface --->implements
//interface - interface --> extends

interface Calcu{

    int number =10; //final ,static

    public int add(); // abstract

    public int sub(); // abstract

    public int fetchData();
}

interface Message extends Calcu{
    public void setMessage();
}

class AdvaCalcu implements Calcu,Message{

    @Override
    public int add() {

        return number;
    }

    @Override
    public int sub() {
        return 5;
    }

    @Override
    public int fetchData() {
        return 0;
    }

    @Override
    public void setMessage() {

    }
}

public class InterfaceConcept {
    public static void main(String [] args){
        AdvaCalcu advaCalcu = new AdvaCalcu();
        advaCalcu.add();
        advaCalcu.sub();


    }

    //normal, functional, Marker
    /*
    interface abc{       interface functional{     interface Market{
       public int add();     public int add();
       public int sub();   }
       }
      ..
      ..
      ...
    }
    *
    * */
}
