package main.java.basics;


public class GrossPayCalculator {
    public static void main(String[] args) {
        // Step 1: Declare the variables
        int hoursWorked;
        double hourlyRate;
        double grossPay;

        IO.println("How many hours did you work?");
        String hours = IO.readln();
        /*
         BEFORE java 25
         Scanner scannaer = new Scanner(System.in);
         //String hours = scanner.nextLine();
         or int hoursWorked = scanner.nextInt();
         or double hoursWorked = scanner.nextDouble();
         scanner.close();
        */
        if (!isNumeric(hours.trim())) {
            IO.println("Invalid input. Please enter a numeric value.");
            return;
        }
        // Step 2: Assign values to the variables
        hourlyRate = 15.50; // Example: $15.50 per hour

        // Step 3: Calculate gross pay
        grossPay = Double.parseDouble(hours) * hourlyRate;

        // Step 4: Display the result
        IO.println("Gross Pay: $" + grossPay);
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

