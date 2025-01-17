import Test.AddNumber;
import Test.tools.Calculator;

import java.util.ArrayList;

class ABC extends Calculator{
    public void show(){
        System.out.println(sub(3,5));
    }


}


public class InheritanceConcept {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        int addResult = calc.add(4,7);
        int subResult = calc.sub(5,2);
        int multiResult = calc.multi(3,7);
        int divResult = calc.div(5,4);
        double powResult = calc.power(4,4);
        System.out.println("add result:  " + addResult + " " + "Sub Result:  " + subResult + " " + "multi Result: " +
                multiResult + " " + "div Result: " +divResult +" " +"power Result: " +powResult);

        AddNumber addNumber= new AddNumber();
        addNumber.show();
        int result = addNumber.add(3,5);
        System.out.println("result is :"+result);
        Calculator calculator= new Calculator();
        int subResultCHeck = calculator.sub(5,3);
        System.out.println("sub result is :"+subResultCHeck);
        calculator.show();
        ArrayList arrayList = new ArrayList();
    }
}
