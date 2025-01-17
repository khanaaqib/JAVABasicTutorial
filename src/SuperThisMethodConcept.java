class A{
    public A(){
        super();
        System.out.println("in constructor A");
    }

    public A(int num){
        super();
        System.out.println("in constructor A int");
    }
}

class B extends A{
   public B(){
       System.out.println("in constructor B");
   }

   public B(int number){
       this();
       System.out.println("in constructor B int");
   }
}

public class SuperThisMethodConcept {
    public static void main(String[] args){
        B b = new B(5);
    }
}
