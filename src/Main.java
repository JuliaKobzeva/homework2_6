import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneList = new HashMap<>();
        phoneList.put("Иван Иванов","89046823301");
        phoneList.put("Петр Иванов","89046823302");
        phoneList.put("Василий Иванов","89046823303");
        phoneList.put("Григорий Иванов","89046823304");
        phoneList.put("Александр Иванов","89046823305");
        phoneList.put("Павел Иванов","89046823306");
        phoneList.put("Семен Иванов","89046823307");
        phoneList.put("Игорь Иванов","89046823308");
        phoneList.put("Николай Иванов","89046823309");
        phoneList.put("Анатолий Иванов","89046823300");
        phoneList.put("Борис Иванов","89046823311");
        phoneList.put("Виталий Иванов","89046823322");
        phoneList.put("Глеб Иванов","89046823333");
        phoneList.put("Артем Иванов","89046823344");
        phoneList.put("Артур Иванов","89046823355");
        phoneList.put("Михаил Иванов","89046823366");
        phoneList.put("Платон Иванов","89046823377");
        phoneList.put("Прохор Иванов","89046823388");
        phoneList.put("Денис Иванов","89046823399");
        phoneList.put("Егор Иванов","89046823310");

        System.out.println(phoneList);

        System.out.println(phoneList.keySet());
        System.out.println(phoneList.values());

        System.out.println(phoneList.get("Иван Иванов"));

    }
}