public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
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

        Student.showData(studentObjects);
    }
}
