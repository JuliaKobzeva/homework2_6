import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Set<String> list = new HashSet<>(15);

        for (int i = 0; i < 15; i++) {
            int a = random.nextInt(4)+2;
            int b = random.nextInt(5)+5;
            String task = a + "*" + b;
            list.add(task);
            System.out.println(task);
        }

    }
}