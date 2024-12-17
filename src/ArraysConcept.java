public class ArraysConcept {
    public static void main(String[] args) {
/*        int i=1;
        int j=3;
        int k=4;
        int l=7;*/

/*        int number[] = {1,3,4,7}; //we already know the variables data
        number[1] = 8;
        System.out.println(number[1]);*/

/*        int number[] = new int[5]; //[0,0,0,0] by default array has 0 values
        number[0] = 4;
        number[1] = 5;
        number[2] =9;
        number[3]= 11;
        number[4] = 13;*/
        //end of this line will get [4,5,9,11,13] this array
/*       System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);*/

/*        for(int i=0; i<5 ;i++){
            if(number[i]>9) {//number[0]//number[1]....
                System.out.println(number[i]);
            }
        }*/

        //Two dimensional array

/*        int numbers[][]= new int[3][4];
        numbers[0][0]=4;
        numbers[0][1]=5;
        numbers[0][2]=9;
        numbers[0][3]=10;
        numbers[1][0]=3;
        numbers[1][1]=6;
        numbers[1][2]=45;
        numbers[1][3]=54;
        numbers[2][0]=6;
        numbers[2][1]=5;
        numbers[2][2]=11;
        numbers[2][3]=13;
        for(int i=0;i<=2;i++){//row
            for(int j=0;j<=3;j++){//column
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/


     /*   int numbers[][]= new int[3][4];

        //assigning the arrays element

        for(int i=0;i<numbers.length;i++){//row
            for(int j=0;j<numbers[i].length;j++) {//column
                numbers[i][j]=(int)(Math.random()*10);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //iterating all array element
        for(int i=0;i<numbers.length;i++){//row
            for(int j=0;j<numbers[i].length;j++){//column
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
*/

        //Jagged Array
        //colum size can be different
        // int numbers[][] = {{1,4,5}.{2,3},{4.6,8,3}}

/*        int numbers[][] = new int[3][];
        numbers[0]= new int[3];
        numbers[1] = new int[2];
        numbers[2] = new int[4];

        for(int i=0;i<numbers.length;i++){//row
            for(int j=0;j<numbers[i].length;j++) {//column
                numbers[i][j]=(int)(Math.random()*10);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //iterating all array element
        for(int i=0;i<numbers.length;i++){//row
            for(int j=0;j<numbers[i].length;j++){//column
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/

        // enhanced for loop
        int number[] = {4,5,6,7};
        for(int n: number){  //for(int i=0;i<number.length;i++)
            if(n>5) {//number[0]//number[1]....
                System.out.println(n);
            }
        }







    }
}
