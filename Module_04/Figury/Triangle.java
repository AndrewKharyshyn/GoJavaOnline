package Module_04.Figury;

/**
 * Created by Andrew on 03.06.2016.
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону треугольника А:");
        float sideA = sc.nextFloat();
        System.out.print("Введите сторону треугольника B:");
        float sideB = sc.nextFloat();
        System.out.print("Введите сторону треугольника С:");
        float sideC = sc.nextFloat();

        float sP = (sideA + sideB + sideC)/2;
        System.out.println("Площадь треугольника: " +Math.sqrt(sP*(sP-sideA)*(sP-sideC)*(sP-sideC)));
                    }
}
