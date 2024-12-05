public class ConditionalStatement {
    public static void main(String[] args) {
/*        int time = 2;
        if(time>5) { //if(true) or if(false)
            System.out.println("Hello");
        } else {
            System.out.println("morning");
        }
        System.out.println("how are you?");*/

/*        // among two which one is greater
        int number1 = 5;
        int number2 = 7;
        if(number1>number2){
            System.out.println("greatest number "+ number1);
        }else{
            System.out.println("greatest number "+ number2);
        }*/

        // greatest among three number
        // if else ladder
/*        int number1= 13;
        int number2= 11;
        int number3= 7;
        if(number1>number2 && number1>number3){//if(true) or if(false)
            System.out.println("greatest number "+ number1);
            System.out.println("number 1");
        }else if(number2>number1 && number2>number3){ //if(true) or if(false)
            System.out.println("greatest number "+ number2);
            System.out.println("number 2");
        }else{
            System.out.println("greatest number "+ number3);
        }*/

        //checking the days
/*        int number = 8;
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("not a match");
        }*/

        // Switch Statement
/*        switch (){
            case:
                System.out.println("not a match");
        }*/
        int number =8;
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a match");
        }
    }
}
