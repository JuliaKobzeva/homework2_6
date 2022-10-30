import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Map<String, List<Integer>> map = new HashMap<>();

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
        Integer number11 = random.nextInt(1000);
        Integer number12 = random.nextInt(1000);
        Integer number13 = random.nextInt(1000);
        Integer number14 = random.nextInt(1000);
        Integer number15 = random.nextInt(1000);


        List<Integer>list = List.of(number1,number2,number3);
        List<Integer>list2 = List.of(number4,number5,number6);
        List<Integer>list3 = List.of(number7,number8,number9);
        List<Integer>list4 = List.of(number10,number11,number12);
        List<Integer>list5 = List.of(number13,number14,number15);

        map.put("Список №1",list);
        map.put("Список №2",list2);
        map.put("Список №3",list3);
        map.put("Список №4",list4);
        map.put("Список №5",list5);

        for(Map.Entry<String, List<Integer>> element : map.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }

        Map<String, Integer> map2 = new HashMap<>();
        map2 = getTransformMap(map);

        for(Map.Entry<String, Integer> element : map2.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }

//        Integer numberSum1 = number1 + number2 + number3;
//        Integer numberSum2 = number4 + number5 + number6;
//        Integer numberSum3 = number7 + number8 + number9;
//        Integer numberSum4 = number10 + number11 + number12;
//        Integer numberSum5 = number13 + number14 + number15;
//
//        Map<String, Integer> map2 = new HashMap<>();
//
//        map2.put("Список №1",numberSum1);
//        map2.put("Список №2",numberSum2);
//        map2.put("Список №3",numberSum3);
//        map2.put("Список №4",numberSum4);
//        map2.put("Список №5",numberSum5);
//
//        for(Map.Entry<String, Integer> element : map2.entrySet()){
//            System.out.println(element.getKey() + " " + element.getValue());
//        }
    }

    public static Map<String, Integer> getTransformMap(Map<String, List<Integer>> map) {
        var temp = new HashMap<String, Integer>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            temp.put(entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1) + entry.getValue().get(2));
        }
        return temp;
    }
}