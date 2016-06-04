package Module_04.Figury;

/**
 * Created by Andrew on 03.06.2016.
 */
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга (r):");
        double radius = sc.nextDouble();

        System.out.println("Площадь круга: " +Math.PI * (Math.pow(radius, 2)));
    }
}
