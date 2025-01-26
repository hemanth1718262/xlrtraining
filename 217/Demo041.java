import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        if (Character.isLetter(inputChar)) {
        
            inputChar = Character.toLowerCase(inputChar);
            
            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println(inputChar + " is not a valid letter.");
        }
        
        scanner.close();
    }
}
