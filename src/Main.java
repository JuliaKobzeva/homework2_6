import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> farm = new HashMap<>();
        Farm farm2 = new Farm(farm);
        farm2.put("лошади",2);
        farm2.put("коровы",3);
        farm2.put("козы",5);
        farm2.put("овцы",4);

        System.out.println(farm2);

        farm2.put("лошади",7);
        System.out.println(farm2);

        farm2.put("лошади",7);
        System.out.println(farm2);

    }
}