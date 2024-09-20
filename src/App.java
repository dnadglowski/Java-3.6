import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        int weight = scanner.nextInt();
        System.out.println("Feet:");
        int feet = scanner.nextInt();
        System.out.println("inches:");
        int inches = scanner.nextInt();
        int height_in_inches = (feet*12) + inches;
        double height_sqt = (height_in_inches*height_in_inches);
        double BMI = 703 * (weight/height_sqt);
    
        System.out.println(BMI);
    }
}
