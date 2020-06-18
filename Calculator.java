package BMI.Calculator;

import java.util.Scanner;

public class Calculator {
    public Float height, weight, bmi;                               // Declaring Class Variables

    public static void main(String[] args) {
        Calculator calc = new Calculator();                         // Declare calc variable and create a new Calculator Class instance
        calc.setUserInput();                                        // Call setUserInput method
        calc.doCalculations();                                      // Call doCalculations method and store results in bmi float
        System.out.println("Your BMI is: " + calc.bmi);             // Prints da results, WIN.. o7
        calc.determineHealthStatus();                               // Call method to print health status
    }

    private void setUserInput() {
        Scanner sc = new Scanner(System.in);                        // Create a Scanner object

        System.out.println("What is your current height in CM?");   // Prompt the user to enter String
        String userHeight = sc.nextLine();                          // Read user input
        this.height = Float.parseFloat(userHeight);                 // Parse input as float.

        System.out.println("What is your current weight in KG??");  // Prompt the user to enter String
        String userWeight = sc.nextLine();                          // Read user input
        this.weight = Float.parseFloat(userWeight);                 // Parse input as float.
    }
    private void doCalculations() {
        this.bmi = weight / ((height / 100) * (height / 100));      // Calculate BMI
    }
    private void determineHealthStatus() {                          // Determine health status based on BMI
        if (this.bmi < 18.5) {
            System.out.println("Go eat a Hamburger Bro!");
        }
        else if (this.bmi > 18.5 && this.bmi < 25) {
            System.out.println("Healthy");
        }
        else if (this.bmi > 25 && this.bmi < 30) {
            System.out.println("Try to lose weight");
        }
        else if (this.bmi > 30){
            System.out.println("Go call a doctor!!!");
        }
    }
}
