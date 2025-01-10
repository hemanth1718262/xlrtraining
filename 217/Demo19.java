public class Demo19
 {
        public static void main(String[] args) {
            
            int daysInYear = 365;
            int hoursInDay = 24;
            int minutesInHour = 60;
        
            int minutesInYear = daysInYear * hoursInDay * minutesInHour;
        
            double daysFromMinutes = (double) minutesInYear / (hoursInDay * minutesInHour);
        
            System.out.println("Minutes in a year: " + minutesInYear);
            System.out.println("Converted to days: " + daysFromMinutes);
        }
    }
    
    
