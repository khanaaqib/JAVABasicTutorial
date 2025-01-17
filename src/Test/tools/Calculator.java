package Test.tools;


public class Calculator{
     int marks;

    public void show(){
        System.out.println("show method");
    }

    public int add(int num1,int num2){
        System.out.println("in Calci");
        return num1+num2;
    }

    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public int sub(int num1,int num2){
        return num1-num2;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(){
        System.out.println(marks);
    }
}

class AdvanCalci extends Calculator{
    public int add(int a,int b){
        System.out.println("in Advance Calci");
        return a+b;
    }
}

class A  extends  Calculator{
    public static void main(String [] args){
        Calculator calculator= new Calculator();
        int result =calculator.add(3,5);
        System.out.println(result);
    }
}
