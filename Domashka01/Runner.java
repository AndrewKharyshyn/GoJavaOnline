package Domashka01;


public class Runner {
    public static void main(String[] args) {
        MySuperArrayList <String> cars = new MySuperArrayList<>(2);
        System.out.println (cars.isEmpty());
        cars.add("Tavria");
        cars.add("Citroen");
        cars.add("Geely");
        System.out.println (cars.isEmpty());

       for (int i=0; i<cars.size(); i++){

           System.out.println(cars.get(i));
       }
    }
}
