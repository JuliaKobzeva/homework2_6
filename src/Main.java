import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<String> list = new ArrayList<>(15);

        for (int i = 0; i < 15; i++) {
            int a = random.nextInt(9);
            int b = random.nextInt(9);
            String task = a + "*" + b;
            list.add(task);
            System.out.println(task);
        }
    }
}