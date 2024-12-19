class Student{
    private int age;
    private int rollno;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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
        System.out.println("roll no is: "+ student.getRollno());

    }
}
