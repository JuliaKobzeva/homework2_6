import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Set<String> list = new HashSet<>();

        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
//            int a = random.nextInt(4)+2;
//            int b = random.nextInt(5)+5;
            int a = random.nextInt(8)+2;
            int b = random.nextInt(8)+2;
            String task = a + "*" + b;
            list.add(task);
            if(list.contains(task) && list.contains(reverseString(task))){
                list.remove(task);
            }
        }

        list2.addAll(list);

        for (int i = 0; i < 15; i++) {
            System.out.println(list2.get(i));
        }

    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}