package Module_04.Figury;

import java.util.Scanner;
public class Rectangle {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
        System.out.print("Введите сторону прямоугольника А:");
            float sideA = sc.nextFloat();
        System.out.print("Введите сторону прямоугольника B:");
             float sideB = sc.nextFloat();

           System.out.println("Площадь прямоугольника: " +sideA*sideB);
        }
}

