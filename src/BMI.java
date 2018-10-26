import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height,2);
        boolean underWeight = bmi < 18.5;
        boolean normal = bmi >= 18.5 && bmi < 25;
        boolean overWeight = bmi >= 25 && bmi <= 30;
        String strBmi = "";

        if (underWeight){
            strBmi = "Underweight";
        }else if (normal){
            strBmi = "Normal";
        }else if (overWeight){
            strBmi = "Overweight";
        }else {
            strBmi = "Obese";
        }

        System.out.printf("%-20.2f %s",bmi,strBmi);
    }
}
