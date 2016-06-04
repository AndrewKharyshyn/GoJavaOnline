package Module_04.Temperatura;

import java.util.Scanner;

/**
 * Created by Andrew on 04.06.2016.
 */
public class CelsiumToF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия:");
        float Celsium = sc.nextFloat();

        System.out.println("Указанная температура в градусах Фаренгейта: " + (32+(Celsium * 1.8)) +" degF");
    }
}
