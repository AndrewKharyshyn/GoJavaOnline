package Module_04.Tochky;

/**
 * Created by Andrew on 04.06.2016.
 */
import java.util.Scanner;
public class PointDistance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Для расчета расстояния между точками, необходимо ввести их координаты");
        System.out.print("Введите координату точки х1:");
        int x1 = sc.nextInt();

        System.out.print("Введите координату точки х2:");
        int x2 = sc.nextInt();

        System.out.print("Введите координату точки y1:");
        int y1 = sc.nextInt();

        System.out.print("Введите координату точки y2:");
        int y2 = sc.nextInt();

        System.out.println("Расстояние между точками на координатной плоскости составляет: " + Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
    }
}
