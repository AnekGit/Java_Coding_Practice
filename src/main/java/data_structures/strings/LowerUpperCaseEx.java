package data_structures.strings;

/**
 * created by ANEK on Friday 3/11/2022 at 9:49 PM
 */

public class LowerUpperCaseEx {
    public static void main(String[] args) {
        char[] arr = {'a','n','e','K','s','I','N','G','H'};
        System.out.println("char [] :: "+arr);

        char convertedCase = 0;
        for(char c : arr){
            if(c >= 'a' && c <= 'z'){
                convertedCase = (char) (c - 32);
            }else if (c >= 'A' && c <= 'Z'){
                convertedCase = (char) (c + 32);
            }

            System.out.print(convertedCase);
        }

        String str = "anek";
        System.out.println("\nstr :: "+str);

        System.out.printf("%c \n",arr[1]);



    }
}
