import java.util.ArrayList;
import java.util.List;

public class Student {
    public String firstName;
    public String lastName;
    public int indexNumber;
    public boolean classified;


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.firstName = "Kasia";
        s1.lastName = "Malinowska";
        s1.indexNumber = 1234;
        s1.classified = true;

        s2.firstName = "Jan";
        s2.lastName = "Kalinowski";
        s2.indexNumber = 6667;
        s2.classified = true;

        s3.firstName = "Marcin";
        s3.lastName = "Nowak";
        s3.indexNumber = 1222;
        s3.classified = false;

        Student[] studentObjects = new Student[3];
        studentObjects[0] = s1;
        studentObjects[1] = s2;
        studentObjects[2] = s3;

        for (Student s : studentObjects){
            System.out.println("Imię: " + s.firstName + ", nazwisko: " + s.lastName + ", nr indeksu: " + s.indexNumber + ", klasyfikowany: " + s.classified );
        }
    }
}
