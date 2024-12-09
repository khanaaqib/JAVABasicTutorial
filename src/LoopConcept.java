public class LoopConcept {
    public static void main(String[] args) {
        /*
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
         */
        //repeat- this statement 5 times
        //loop- while, do while, for loop, enhance for loop(for each loop)

        // while loop
        //while(condition) -> true or false
        //initialization, condition, increment
/*        int msg =1;
        while(msg<=6){
            System.out.println("Hello"+" : " + msg);
            msg++;
        }
        System.out.println("Bye"+" : " + msg);*/

        //nested while loop
/*        int msg =1;
        while(msg<=6){
            System.out.println("Hello"+" : " + msg);
            int index =1;
            while(index<=3){
                System.out.println("Santosh"+" : " + index);
                index++;
            }
            msg++;
        }
        System.out.println("Bye"+" : " + msg);*/
      /* do{
        }
        while(condtion)* -> true or false*/

        //do while
/*        int i=1;
        do{
            System.out.println("Hello Aaqin how are you?"+" : " + i);
            i++;
        }while(i<=6);*/

        //for loop
        // for(initialization;  condition; increment)
/*        for(int i=1; i<=6; i++){
            System.out.println("Hello Giri"+" : " + i);
        }
        System.out.println("by Giri");*/

        //Nested for loop

        for(int i=1; i<=6; i++){
            System.out.println("Hello Giri"+" : " + i);
            for(int j=1; j<=3; j++) {
                System.out.println("Good Morning!"+" : " + j);
            }
        }
        System.out.println("by Giri");

        //enhance for loop
        // for( int n: length of data)
/*        int[] numbers = {3, 9, 5, -5};

        // for each loop
        for (int number: numbers) { // for(int number=0; number<=4; number++)
            System.out.println(number);
        }*/

    }
}
