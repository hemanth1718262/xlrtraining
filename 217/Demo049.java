import java.util.Scanner;

public class Demo049 {

    public static void main(String[] args) {
    
        Demo049 demo = new Demo049();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int reversedNumber = demo.reverseNumber(number);

        System.out.println("The reversed number is: " + reversedNumber);


        scanner.close();
    }

    public int reverseNumber(int number) {
        int reversed = 0;

    
        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit; 
            number /= 10;  
        }

        return reversed;
    }
}
