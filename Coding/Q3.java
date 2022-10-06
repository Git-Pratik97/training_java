import java.util.Scanner;

public class Q3 {
    // reverseIt method
    // swaps 1st and last characters in the same string

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = scan.nextLine();
        scan.close();

        String reversedString = reverseIt(string);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseIt(String string) {
        char[]  array = string.toCharArray();
        char temp;
        for (int i = 0; i < (array.length/2); i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        String reversedString = String.valueOf(array);
        return reversedString;
    }
}
