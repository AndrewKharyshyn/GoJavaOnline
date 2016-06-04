package Module_04.Temperatura;

/**
 * Created by Andrew on 04.06.2016.
 */
import java.util.Scanner;

public class FarengheitToC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Фаренгейта:");
        float Farengheit = sc.nextFloat();

        System.out.println("Указанная температура в градусах Цельсия: " + ((Farengheit-32)/1.8) +" degC");
    }
}
