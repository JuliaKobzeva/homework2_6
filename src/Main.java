import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        Integer number1 = random.nextInt(1000);
        Integer number2 = random.nextInt(1000);
        Integer number3 = random.nextInt(1000);
        Integer number4 = random.nextInt(1000);
        Integer number5 = random.nextInt(1000);
        Integer number6 = random.nextInt(1000);
        Integer number7 = random.nextInt(1000);
        Integer number8 = random.nextInt(1000);
        Integer number9 = random.nextInt(1000);
        Integer number10 = random.nextInt(1000);

        map.put(number1,"Число №1");
        map.put(number2,"Число №2");
        map.put(number3,"Число №3");
        map.put(number4,"Число №4");
        map.put(number5,"Число №5");
        map.put(number6,"Число №6");
        map.put(number7,"Число №7");
        map.put(number8,"Число №8");
        map.put(number9,"Число №9");
        map.put(number10,"Число №10");

        for(Map.Entry<Integer,String> element : map.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }

    }
}