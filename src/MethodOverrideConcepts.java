class Calci{
    public int add(int num1,int num2){
        return num1+num2;
    }

}

class AdvanceCalci extends Calci{
    public int add(int num1,int num2){
        return num1+num2+10;
    }
}


public class MethodOverrideConcepts {
    public static void main(String [] args){
        AdvanceCalci advanceCalci = new AdvanceCalci();
        int result = advanceCalci.add(3,5);
        System.out.println("result is :  " + result);
    }
}
