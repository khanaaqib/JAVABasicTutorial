class College{

    String teacherName;
    int teacherAge;

    public College(){  // default Constructor
        System.out.println("in  College Constructor");
        this.teacherName="Aaqob";
        this.teacherAge=40;
    }

    public College(String name, int age){  // parameterized Constructor
        System.out.println("in  College parameterized Constructor");
        this.teacherName= name;
        this.teacherAge= age;
    }

}

public class ConstructorConcept {
    public static void main(String[] args) {
        College col = new College() ;
        College col1 = new College("Santhosh",30) ;
        System.out.println("techerName :" + col1.teacherName + ":  " + "age: " + col1.teacherAge);
    }
}
