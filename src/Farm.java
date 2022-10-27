import java.util.HashMap;

public class Farm {
    private HashMap<String, Integer> farm = new HashMap<>();

    public Farm(HashMap<String, Integer> farm) {
        this.farm = farm;
    }

    public void put(String string, Integer integer) {
        if (farm.containsKey(string) && !farm.containsValue(integer)) {
            farm.replace(string, integer);
        } else if (farm.containsKey(string) && farm.containsValue(integer)){
            throw new RuntimeException("Информация уже содержится в списке");
        } else {
            farm.put(string, integer);
        }
    }

    @Override
    public String toString() {
        return "" + farm;
    }
}
