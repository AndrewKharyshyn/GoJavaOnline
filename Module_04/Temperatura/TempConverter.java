package Module_04.Temperatura;

/**
 * Created by Andrew on 04.06.2016.
 */
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Калькулятор температур (Цельсий/Фаренгейт)");
        System.out.print("Введите тип единиц, который Вы хотите преобразовать (C/F):");
        String tempType = sc.next();

            if (tempType.equals("F")) {
                System.out.print("Введите температуру в градусах Фаренгейта:");

                float Farengheit = sc.nextFloat();
                System.out.println("Указанная температура в градусах Цельсия: " + ((Farengheit - 32) / 1.8) + " degC");

            } else if (tempType.equals("C")) {
                System.out.print("Введите температуру в градусах Цельсия:");

                float Celsium = sc.nextFloat();
                System.out.println("Указанная температура в градусах Фаренгейта: " + (32 + (Celsium * 1.8)) + " degF");


            } else {
                System.err.println("Вы ввели неправильную единицу температуры");

            }
        }
    }




