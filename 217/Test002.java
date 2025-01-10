import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Are you celebrating Sankranthi? (yes/no): ");
        String sankranthiInput = scanner.nextLine().trim().toLowerCase();  


        System.out.print("Are you celebrating Pongal? (yes/no): ");
        String pongalInput = scanner.nextLine().trim().toLowerCase();  

    
        if (sankranthiInput.equals("yes")) {
            System.out.println("Yes, you are celebrating Sankranthi!");
        } else {
            System.out.println("No, you are not celebrating Sankranthi.");
        }

        if (pongalInput.equals("yes")) {
            System.out.println("Yes, you are celebrating Pongal!");
        } else {
            System.out.println("No, you are not celebrating Pongal.");
        }

        scanner.close();
    }
}
