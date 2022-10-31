import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Passport {
    private String number;
    private String surname;
    private String name;
    private String patronymic;

    private Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY , 01);
    DateFormat df = new SimpleDateFormat("dd MMM yyyy");


    public Passport(String number, String surname, String name, String patronymic, int year, int month, int day) {

        if(number == null || number.isEmpty() || number.isBlank()|| number.length() != 9){
            throw new RuntimeException("Нужно ввести номер пасспорта");
        }else{
            this.number = number;
        }

        if(surname == null || surname.isEmpty() || surname.isBlank()){
            throw new RuntimeException("Нужно ввести фамилию");
        }else{
            this.surname = surname;
        }

        if(name == null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Нужно ввести имя");
        }else{
            this.name = name;
        }

        if(patronymic == null || patronymic.isEmpty() || patronymic.isBlank()){
            this.patronymic = "отчество не указано";
        }else{
            this.patronymic = patronymic;
        }

        if(year == 0){
            throw new RuntimeException("Нужно ввести год рождения");
        }else{
            calendar.set(Calendar.YEAR, year);
        }

        if(month < 0 || month > 11){
            throw new RuntimeException("Неправильный формат месяца");
        }else{
            calendar.set(Calendar.MONTH, month);
        }

        if(day < 0 || day > 31){
            throw new RuntimeException("Неправильный формат даты");
        }else{
            calendar.set(Calendar.DAY_OF_MONTH, day);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty() || surname.isBlank()){
            throw new RuntimeException("Нужно ввести фамилию");
        }else{
            this.surname = surname;
        }
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Нужно ввести имя");
        }else{
            this.name = name;
        }
    }

    public void setPatronymic(String patronymic) {
        if(patronymic == null || patronymic.isEmpty() || patronymic.isBlank()){
            this.patronymic = "отчество не указано";
        }else{
            this.patronymic = patronymic;
        }
    }

    public void setCalendar(int year, int month, int day) {
        if(year == 0){
            throw new RuntimeException("Нужно ввести год рождения");
        }else{
            calendar.set(Calendar.YEAR, year);
        }

        if(month < 0 || month > 11){
            throw new RuntimeException("Неправильный формат месяца");
        }else{
            calendar.set(Calendar.MONTH, month);
        }

        if(day < 0 || day > 31){
            throw new RuntimeException("Неправильный формат даты");
        }else{
            calendar.set(Calendar.DAY_OF_MONTH, day);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(surname, passport.surname) && Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(calendar, passport.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surname, name, patronymic, calendar);
    }

    @Override
    public String toString() {
        return "Пасспорт " +
                "номер: " + number +
                ", фамилия: " + surname +
                ", имя: " + name +
                ", отчество: " + patronymic +
                ", дата рождения: " + df.format(calendar.getTime());
    }
}
