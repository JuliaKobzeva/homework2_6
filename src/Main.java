import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Integer number = random.nextInt(1000);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(number);
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if(element  % 2 != 0){
                list.remove(element);
            }
        }

        System.out.println(list);
    }
}