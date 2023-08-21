import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator!");
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String bmiCategory = interpretBMI(bmi);

        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "You are underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "You have a normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "You are slightly overweight";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "You are obese";
        } else {
            return "You are clinically obese";
        }
    }
}
