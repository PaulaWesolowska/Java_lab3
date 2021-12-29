import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Vehicle vehicle = new Vehicle("Audi", "Q5", 2018, 147900);
        System.out.println(vehicle.toString());
        System.out.println("Informacje o pojeździe: " + vehicle.getInfoAboutCar() + "\n");

        Car car = new Car("Mazda", "CX-5", 2021, 189165, "white", 5, 5 );
        System.out.println(car.toString());
        System.out.println("Informacje o pojeździe: " + car.getInfoAboutCar() + "\n");


        SUV suv1 = new SUV("Volkswagen", "Tiguan", 2021, 154900, "silver", 5, 5, true, false, 1800);
        System.out.println(suv1.toString());
        System.out.println("Informacje o pojeździe: " + suv1.getInfoAboutCar() + "\n");

        SUV suv2 = new SUV("Nissan", "Qashqai", 2021, 132080, "grey", 5, 5, true, false, 1500);
        System.out.println(suv2.toString());
        System.out.println("Informacje o pojeździe: " + suv2.getInfoAboutCar() + "\n");

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle);
        vehicleList.add(car);
        vehicleList.add(suv1);
        vehicleList.add(suv2);
        System.out.println("\nVEHICLE LIST: ");
        System.out.println(vehicleList);

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(suv1);
        carList.add(suv2);
        System.out.println("\nCAR LIST: ");
        System.out.println(carList);

        List<SUV> suvList = new ArrayList<>();
        suvList.add(suv1);
        suvList.add(suv2);
        System.out.println("\nSUV LIST: ");
        System.out.println(suvList);
    }
}
