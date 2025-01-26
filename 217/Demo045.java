public class Demo045 {
    public static void main(String[] args) {
        Demo045 demo = new Demo045();
        int num1 = 10, num2 = 20;
        System.out.println("Before swapping: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        demo.swapNumbers(num1, num2);
    }
    public void swapNumbers(int num1, int num2) {
        num1 = num1 + num2;  
        num2 = num1 - num2;  
        num1 = num1 - num2;  
        System.out.println("\nAfter swapping: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
