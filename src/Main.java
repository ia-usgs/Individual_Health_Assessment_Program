import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (in kg)- ");
        double weight = sc.nextDouble();
        System.out.println("Enter Height (in meters)- ");
        double height = sc.nextDouble();

        double bmi =  weight / height;
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18) {
            System.out.println("You are seriously underweight!");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight!");
        } else if (bmi < 25) {
            System.out.println("You are normal weight!");
        } else if (bmi < 30) {
            System.out.println("You are obese!");
        }


    }
}