import java.util.Arrays;

public class StringConcept {
    public static void main(String[] args) {
/*        String name="java";
       // String nameValue = new String("java");
       // name = "Hello" + ": " +name;
        String s1 = "Aaqib";
        String s2 = "Aaqib";
        System.out.println(name);
        System.out.println(s1==s2);
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.length());*/

 /*       StringBuffer stringBuffer= new StringBuffer("java");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.charAt(3));
        System.out.println(stringBuffer.append("test"));*/

        StringBuilder stringBuilder = new StringBuilder("javaTutorial");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.substring(stringBuilder.length() - 1, stringBuilder.length()));
        System.out.println(stringBuilder.deleteCharAt(4));
        System.out.println(stringBuilder.delete(2, 6));


        String str[] = {"Aaqib", "Santosh", "Giri"};
        for (String s : str) {
            if(s.contains("Aaqib")) {
                System.out.print(s + " : ");
            }
        }
    }

}
