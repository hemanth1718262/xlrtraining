public class Demo18 {

        void minToYrs() {
            int minutes = 3000010;
            int year = minutes / (365 * 24 * 60);
            System.out.println("Years: " + year);
            int remainingMinutesAfterYears = minutes % (365 * 24 * 60);
            int days = remainingMinutesAfterYears / (24 * 60);
            System.out.println("Days: " + days);
            int remainingMinutesAfterDays = remainingMinutesAfterYears % (24 * 60);
            int hours = remainingMinutesAfterDays / 60;
            System.out.println("Hours: " + hours);
            int remainingMinutes = remainingMinutesAfterDays % 60;
            System.out.println("Minutes: " + remainingMinutes);
        }
    }
    
    public class Demo018 {
        public static void main(String[] args) {
            MinutesToYears obj = new MinutesToYears();
            obj.minToYrs();
        }
    }

