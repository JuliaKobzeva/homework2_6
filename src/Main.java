import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Integer number = random.nextInt(1000);
            list.add(number);
            for (int j = 0; j < list.size(); j++) {
                Integer element = list.get(j);
                if(element  % 2 != 0){
                    list.remove(element);
                }
            }
        }

        System.out.println(list);
    }
}