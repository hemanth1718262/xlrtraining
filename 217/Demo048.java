import java.util.Scanner;

public class Demo048 {

    public static void main(String[] args) {
        Demo048 demo = new Demo048();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int sum = demo.sumOfDigits(number);

        System.out.println("The sum of digits of " + number + " is: " + sum);

        
        scanner.close();
    }
    public int sumOfDigits(int number) {
        number = Math.abs(number); 

        int sum = 0;
        while (number != 0) {
            sum += number % 10;  
            number /= 10;       
        }

        return sum;
    }
}
