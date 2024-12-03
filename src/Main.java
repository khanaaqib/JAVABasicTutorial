public class Main {
    public static void main(String[] args) {
        //java variables
        System.out.println("Hello world!");
        String name="Aaqib";
        int number = 129;
        float marks = 98.3877f;
        char character = 'a';
        boolean flag = true;
        /*System.out.println("first Name is " +name + "  "+ "number is" + number +"  " +"marks is " + marks+
                           " " +"character is" + character + "  " + "flag is " + flag );*/
        System.out.println("first name is" + name);
        System.out.println("number  is" + number);
        System.out.println("marks is" + marks);
        System.out.println("letter is" + character);
        System.out.println("boolean value  is" + flag);
        /* type of data
        1. primitive data
            byte ->  -128 to 127
            short -> -32,768 to 32767
            int   -> -2,147,483,648 to 2,147,483,647
            long  -> -9.223,372,036,854,775 to 9.223,372,036,854,774
            float -> 6 to 7 decimal place
            double -> approx 16 decimal
            char -> Single character
            boolean -> true or false
        2. non- primitive
            String -> String values
            Arrays -> combination of data
            Classes -> Entity
            Collection -> collection of Data
         */

        //TypeCasting
        // Widening Typecasting
        /*
         byte->short->char->int->long->float->double
         */

        /* Narrowing TypeCasting
         double->float->long->int->char->short->byte
         */
        int num = 129;//automatic typecasting will happen(widening typecasting)
        byte narrowingtypecast = (byte)129;//automatic typecasting will not happen(narrowing typecasting)

        int average = (int)98.3877f;
        System.out.println("average is "+ average);

        int obtainMarks= 450;
        int totalMarks = 500;
        float percentage = obtainMarks/totalMarks*100;
        System.out.println("percentage is "+ percentage);

        /*
        Java Operators
         1.Arithmetic Operation -> +,-,*,/,%,increment,decrement
         */

      /*int num1 = 7;
        int num2 = 5;
        int addNumber = num1+num2;
        int minusNumber = num1-num2;
        int multiplyNumber = num1*num2;
        int devideNumber = num1/num2; //quotient
        int moduloNumber = num1%num2; //reminder
        System.out.println("Adding two number"+ addNumber);
        System.out.println("Subtract two number"+ minusNumber);
        System.out.println("Multiply two number"+ multiplyNumber);
        System.out.println("devide two number"+ devideNumber);
        System.out.println("Modulo two number"+ moduloNumber);*/
        int digit= 10;
        //digit= digit+1;
        //digit +=1;
        //digit++;//increment
        //digit--;  //decrement
        //int result = digit++;//post-increment
        int result = ++digit; // pre-increment
        System.out.println("result"+ result);


        /*
         2.Relation Operators -> >,<,==,!=
         */

        int firstNumber = 9;
        int secondNumber = 8;
        //boolean finalResult = firstNumber > secondNumber;
        //boolean finalResult = firstNumber < secondNumber;
        //boolean finalResult = firstNumber == secondNumber;
        /*boolean finalResult = firstNumber == secondNumber;
        boolean finalResult1 = !finalResult;*/
        //boolean finalResult = firstNumber >= secondNumber;
        //boolean finalResult = firstNumber <= secondNumber;
        boolean finalResult = firstNumber != secondNumber;
        System.out.println("finalResult value  "+ finalResult);


        /*
         3.Logical Operator
         AND-&&
         T    T  -> T
         T    F  -> F
         F    T  ->F
         F    F   -> F

         OR - ||
         T    T -> T
         T    F -> T
         F    T -> T
         F    F -> F

         NOT - !
         T    -> F
         F    -> T
         */

        int fNumber = 4;
        int sNumber = 7;
        int tNumber = 11;
        int forthNumber = 9;
        int fifthNumber = 13;
        int sixthNumber = 15;
        //boolean finalData = fNumber > sNumber && tNumber < forthNumber;
        //boolean finalData = fNumber > sNumber && tNumber > forthNumber && fifthNumber<sixthNumber;//(short circuit) first comparison is false it will not chekc the further statement
        //boolean finalData = fNumber > sNumber || tNumber < forthNumber;
        boolean finalData = fNumber < sNumber || tNumber < forthNumber || fifthNumber>sixthNumber;////(short circuit) first comparison is true it will not chekc the further statement
        System.out.println("finalData value  "+ finalData);

    }
}