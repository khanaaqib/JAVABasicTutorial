class Car{

    public int speed(){
        return 80;
    }

}

class Human{

    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String getPen(int price){
        if(price>=10) {
            return "Pen";
        } else {
            return "Pen Not Found";
        }
    }

}
public class MethodConcept {
    public static void main(String[] args) {
        int priceValue = 11;
        Human human = new Human();
        human.playMusic();
        String penValue = human.getPen(priceValue);
        System.out.println("Pen is :   " + penValue);
        Car tesla =  new Car();
        int speed = tesla.speed();
        System.out.println("car speed is :   " + speed);
    }
}
