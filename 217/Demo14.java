public class Demo14 {
    class UnaryDemo14 {
        void UnaryOp() {
            int a = 10, b = 5;
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(b--);
            System.out.println(--b);
            
            a = 5; 
            b = 5;
            int c = a++ * --b * a;
            System.out.println(c);
        }
    
    }
    public class Demo014 {
        public static void main(String[] args) {
            UnaryDemo14 obj = new UnaryDemo14 ();
            obj.UnaryOp();
        }
    }
    
}
