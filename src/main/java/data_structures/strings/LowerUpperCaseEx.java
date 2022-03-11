package data_structures.strings;

/**
 * created by ANEK on Friday 3/11/2022 at 9:49 PM
 */

public class LowerUpperCaseEx {
    public static void main(String[] args) {
        char[] arr = {'a','n','e'};

        for(char c : arr){
            System.out.println("upper case :: "+ (char)(c-32) );
        }

        int i = 0 ;
        while( i < arr.length){
            char upperCase = (char) (arr[i] - 32);
            System.out.println(arr[i]+" in UpperCase :: "+upperCase);
            i++;
        }

        System.out.println("char [] length :: "+arr.length +" => "+ arr[0]+" , "+arr[1]);

        String str = "anek";
        System.out.println("str :: "+str);

        System.out.printf("%c \n",arr[1]);



    }
}
