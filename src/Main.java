import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
    //    WydzialEnum wydzial = new WydzialEnum();

        Person person1 = new Person("Katarzyna", "Nowak", "11111");
        Person person2 = new Person("Jan", "Malinowski", "22222");
        Person person3 = new Person("Alicja", "Kalinowska", "33333");
        Person person4 = new Person("Antoni", "Zieliński", "44444");
        Person person5 = new Person("Martyna", "Bielińska", "55555");


        Student student1 = new Student(person1, WydzialEnum.wydzialEnum.HISTORYCZNY);
        Student student2 = new Student(person2, WydzialEnum.wydzialEnum.MECHATRONIKI);
        Student student3 = new Student(person3, WydzialEnum.wydzialEnum.PSYCHOLOGII);
        Student student4 = new Student(person4, WydzialEnum.wydzialEnum.JĘZYKOZNAWSTWA);
        Student student5 = new Student(person5, WydzialEnum.wydzialEnum.PEDAGOGIKI);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

        for (Student s : studentsList){
            System.out.println(s.toString());
        }
    }
}
class Person {
    private String firstName;
    private String lastName;
    private String index;

    public Person(String firstName, String lastName, String index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIndex() {
        return index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPersonData(){
        return "Imię: " + this.firstName + ", nazwisko: " + this.lastName + ", numer indeksu: " + this.index;
    }
}


class Student {
    private Person person;
    private WydzialEnum.wydzialEnum wydzial;

    public Student(Person person, WydzialEnum.wydzialEnum wydzial) {
        this.person = person;
        this.wydzial = wydzial;
    }

    public Person getPerson() {
        return person;
    }

    public WydzialEnum.wydzialEnum getWydzial() {
        return wydzial;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setWydzial(WydzialEnum.wydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Imię = " + person.getFirstName() +
                ", nazwisko = " + person.getLastName() +
                ", nr indeksu = " + person.getIndex() +
                ", wydział =  " + wydzial;
    }
}