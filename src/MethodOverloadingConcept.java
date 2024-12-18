class Computer{

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }

    public int add(int n1,int n2, int n3,int n4){
        return n1+n2+n3+n4;
    }

    public int add(double n1, int n2){
        return (int) (n1+n2);
    }


}

public class MethodOverloadingConcept {
    public static void main(String[] args) {

        int num1=5;
        int num2 =6;
        int num3 = 8;
        int num4=9;
        Computer computer = new Computer();
        int result=computer.add(num1,num2);
        System.out.println("result of two number: " + result);

    }
}
