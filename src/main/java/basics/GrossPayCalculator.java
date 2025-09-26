package basics;

public class GrossPayCalculator {
    public static void main(String[] args) {
        // Step 1: Declare the variables
        double hourlyRate;
        double grossPay;

        IO.println("How many hours did you work?");
        String hours = IO.readln();
        /*
         * BEFORE java 25
         * Scanner scannaer = new Scanner(System.in);
         * //String hours = scanner.nextLine();
         * or int hoursWorked = scanner.nextInt();
         * or double hoursWorked = scanner.nextDouble();
         * scanner.close();
         */
        if (!isNumeric(hours.trim())) {
            IO.println("Invalid input. Please enter a numeric value.");
            return;
        }
        hourlyRate = 15.50;

        grossPay = Double.parseDouble(hours) * hourlyRate;
        IO.println("Gross Pay: " + grossPay);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException _) {
            return false;
        }
    }
}
