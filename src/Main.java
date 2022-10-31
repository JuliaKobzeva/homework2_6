import java.util.*;

public class Main {
    public static void main(String[] args) {

        Passport ivanov = new Passport("123456781", "Иванов","Иван","",2000,0,25);
        Passport frolova = new Passport("123456782", "Фролова","Анна","Игоревна",1985, 3,5);
        Passport goncharov = new Passport("123456783", "Гончаров","Василий","Павлович",1993,7,17);

        Map <String,Passport> passports = new HashMap();
        Passports passports2 = new Passports(passports);
        passports2.put("123456781", ivanov,"Иванов","Иван","",2000,0,25);
        passports2.put("123456782", frolova,"Фролова","Анна","Игоревна",1985, 3,5);
        passports2.put("123456783", goncharov, "Гончаров","Василий","Павлович",1993,7,17);

        Passport test = passports2.findPassport("123456781");
        System.out.println(test);

        passports2.put("123456781", ivanov,"Иванов","Петр","Владимирович",1975,10,19);
        Passport test2 = passports2.findPassport("123456781");
        System.out.println(test2);

    }
}