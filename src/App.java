import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds:"); //user input weight in pounds
        int weight = scanner.nextInt();
        System.out.println("Enter height in Feet:");//user input height in feet
        int feet = scanner.nextInt();
        System.out.println("Enter remaining height in inches:");//user input remander in inches
        int inches = scanner.nextInt();
        scanner.close();
//find if values given are vaild
        if (weight <= 0 || feet < 0 || inches < 0 || inches >= 12) {
            System.out.println("Invalid input. Weight must be positive, and height values must be realistic.");
            scanner.close();
            return;
        }
        int height_in_inches = (feet*12) + inches; //finds total height in inches
//checks to make sure vaild height input
        if (height_in_inches == 0) {
            System.out.println("Height cannot be zero.");
            scanner.close();
            return;
        }
        double height_sqt = (height_in_inches*height_in_inches); //find height squared
        double BMI = 703 * ((double) weight / height_sqt); //finds BMI
    
        System.out.printf("BMI is %.2f%n", BMI);// rounds to 2 decimal places
        //finds what range BMI is in 
        String result = (BMI < 18.5) ? "Underweight" :
        (BMI >= 18.5 && BMI < 25) ? "Healthy weight" :
        (BMI >=25 && BMI < 30) ? "Overweight" :
        "Obese" ;
    
    System.out.println(result);

 }
}
