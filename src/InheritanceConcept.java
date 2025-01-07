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
    }
}
