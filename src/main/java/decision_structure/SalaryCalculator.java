package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 200;
        int quota = 10;
        IO.println("How many sales did the empl. get");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        if (sales >= quota)
            salary += bonus;
        IO.println("Salary is: " + salary);
    }
}
