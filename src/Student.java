public class Student {
    public String firstName;
    public String lastName;
    public int indexNumber;
    public boolean classified;

        public static void showData(Student[] studentObjects) {
            System.out.println("Lista studentów: \n");
            for (Student s : studentObjects)
                System.out.println("Imię: " + s.firstName + ", nazwisko: " + s.lastName + ", nr indeksu: " + s.indexNumber + ", klasyfikowany: " + s.classified);
        }
}

