package Test;

//final keyword-variable,method,class

class Calculator{
     public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvanceCalculator extends Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class FinalKeywordConcept {
    public static void main(String [] args){
        final double PI=3.14;
        System.out.println("number is : " +PI);
        Calculator calculator= new Calculator();
        calculator.add(5,4);

    }



}
