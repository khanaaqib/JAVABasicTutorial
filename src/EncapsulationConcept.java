class Student{
    private int age =10;
    private int rollno;
    private String name;

    public int getRollno(){
        return rollno;
    }

    public void setRollno(int rollno){
        this.rollno=  rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationConcept {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("java tutorial");
        student.setRollno(101);
        System.out.println("name is: "+ student.getName());
        System.out.println("roll no is: "+ student.getRollno());

    }
}
