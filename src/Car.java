public class Car extends Vehicle{
    protected String color;
    protected int doors;
    protected int seats;

    public Car(String brand, String model, int year, double price, String color, int doors, int seats) {
        super(brand, model, year, price);
        this.color = color;
        this.doors = doors;
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String isFiveDoors(){
        if (this.doors == 5){return "Pojazd jest pięciodrzwiowy";}
            else {return "Pojazd nie ma 5 drzwi";}
    }

    @Override
    protected String getInfoAboutCar() {
        return super.getInfoAboutCar() + ", liczba drzwi: " + doors;
    }

    @Override
    public String toString() {
        return "Car { " +
                super.toString() +
                "color = '" + color + '\'' +
                ", doors = " + doors +
                ", seats = " + seats +
                '}';
    }
}
