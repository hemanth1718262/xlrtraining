import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

    
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        
        scanner.close();
    }
}

    
