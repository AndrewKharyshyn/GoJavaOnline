package Module6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by Andrew on 23.06.2016.
 */
public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MusicShop musicShop = new MusicShop();
        Map<String, Integer> stock = new HashMap<String, Integer>();

        stock.put("Piano", 2);
        stock.put("Guitar", 16);
        stock.put("Trumpet", 7);

        musicShop.setStock(stock);

        Map<String, Integer> order1 = new HashMap<String, Integer>();

        order1.put("Guitar", 7);
        order1.put("Trumpet", 2);

        Map<String, Integer> order2 = new HashMap<String, Integer>();

        order2.put("Piano", -1);

        Map<String, Integer> order3 = new HashMap<String, Integer>();

        order3.put("Piano", 1);
        order3.put("Guitar", 8);
        order3.put("Trumpet", 6);

        try {
            musicShop.prepareInstruments(order1);
        } catch (NoSuchElementException NotEnoughElements1) {
            System.err.println("На складе недостаточно товара: " + NotEnoughElements1.getMessage() + "!");
        } catch (IncorrectQuantityException incorrectQuantity) {
            System.err.println("Количество товара должно быть больше 0!");
        }

        try {
            musicShop.prepareInstruments(order2);
        } catch (NoSuchElementException NotEnoughElements2) {
            System.err.println("На складе недостаточно товара: " +NotEnoughElements2.getMessage()+ "!");
        } catch (IncorrectQuantityException incorrectQuantity) {
            System.err.println("Количество товара должно быть больше 0!");
        }
        try {
            musicShop.prepareInstruments(order3);
        } catch (NoSuchElementException NotEnoughElements3) {
            System.err.println("На складе недостаточно товара: " +NotEnoughElements3.getMessage()+ "!");
        } catch (IncorrectQuantityException incorrectQuantity) {
            System.err.println("Количество товара должно быть больше 0!");
        }
          }
            }


