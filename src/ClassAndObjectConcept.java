class AddNumber{
    public int add(int n1,int n2){
        System.out.println("Adding two Number");
        int result= n1 + n2;
        return result;
    }
}

public class ClassAndObjectConcept {
    public static void main(String[] args) {
        //Object-behavior, Properties
        //classes-Entity(blueprint)
/*        int number1=8;
        int number2= 5;
        int result= number1 + number2;
        System.out.println("result  is : " + result);*/
        int num1 = 5;
        int num2 = 7;
        AddNumber addValue = new AddNumber();
        int resultValue = addValue.add(num1,num2);
        System.out.println(resultValue);
    }
}
