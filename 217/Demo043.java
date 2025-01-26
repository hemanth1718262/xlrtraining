public class Demo043 {

    
    public static char convertToLower(char uppercaseChar) {
    
        if (Character.isUpperCase(uppercaseChar)) {
            return Character.toLowerCase(uppercaseChar); 
        } else {
            return uppercaseChar; 
        }
    }

    public static void main(String[] args) {
        char uppercaseChar = 'A'; 
        System.out.println("Original character: " + uppercaseChar);
        
        char lowercaseChar = convertToLower(uppercaseChar);
        System.out.println("Converted to lowercase: " + lowercaseChar);
    }
}

