import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map <String,Passport> passports = new HashMap();

    public Passports(Map<String, Passport> passports) {
        this.passports = passports;
    }

    public void put(String string, Passport passport, String surname, String name, String patronymic, int year, int month, int day) {
        if (passports.containsKey(string)) {
            passport.setSurname(surname);
            passport.setName(name);
            passport.setPatronymic(patronymic);
            passport.setCalendar(year, month, day);
        } else {
            passports.put(string, passport);
        }
    }

    public Passport findPassport(String string){
        if (passports.containsKey(string)) {
            return passports.get(string);
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "" + passports.values();
    }
}
