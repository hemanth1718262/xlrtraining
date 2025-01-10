public class Demo20 {

        public static void main(String[] args) {
            // Number of terms you want in the Fibonacci series
            int n = 10;
    
            // First two numbers in the Fibonacci series
            int a = 0, b = 1;
    
            // Print the Fibonacci series
            System.out.println("Fibonacci Series up to " + n + " terms:");
    
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                // Update the values of a and b for the next term
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
        }
    }
    
    
