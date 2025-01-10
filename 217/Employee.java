public class Employee {

        // Instance variables
        private int id;
        private String firstname;
        private String lastname;
        private String address;
    
        // Default Constructor
        public Employee() {
            this.id = 0;
            this.firstname = "";
            this.lastname = "";
            this.address = "";
        }
    
        // Parameterized Constructor
        public Employee(int id, String firstname, String lastname, String address) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
        }
    
        // Getter for Full Name (concatenation of firstname and lastname)
        public String getFullName() {
            return this.firstname + " " + this.lastname;
        }
    
        // Getters and Setters for instance variables (optional)
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getFirstname() {
            return firstname;
        }
    
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
    
        public String getLastname() {
            return lastname;
        }
    
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Main method to test the class
        public static void main(String[] args) {
            // Creating Employee using parameterized constructor
            Employee emp = new Employee(1, "John", "Doe", "123 Main St");
    
            // Printing full name
            System.out.println("Full Name: " + emp.getFullName());
        }
    }
    
    

