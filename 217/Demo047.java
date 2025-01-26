import java.util.Scanner;

public class Demo047 {

    public static void main(String[] args) {
        Demo047 demo = new Demo047();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = demo.countDigits(number);

        System.out.println("The number of digits in " + number + " is: " + digitCount);
        scanner.close();
    }
    public int countDigits(int number) {
        if (number < 0) {
            number = -number; 
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;  
            count++;     
        }
        return count;
    }
}
