public class PS002 {
        public static int getNextMultipleOf100(int value) {
            if (value <= 0) {
                return -1;
            }
            return ((value / 100) + 1) * 100;
        }
    
        public static void main(String[] args) {
            int[] inputs = {899, 100, 1230, -5, 0};
            for (int num : inputs) {
                System.out.println("Input: " + num + ", Output: " + getNextMultipleOf100(num));
            }
        }
    }
    

