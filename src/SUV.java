public class SUV extends Car{
    protected boolean fourWheelDrive;
    private boolean miniSUV;
    private int capacityOfTowing;

    public SUV(String brand, String model, int year, double price, String color, int doors, int seats, boolean fourWheelDrive, boolean miniSUV, int capacityOfTowing) {
        super(brand, model, year, price, color, doors, seats);
        this.fourWheelDrive = fourWheelDrive;
        this.miniSUV = miniSUV;
        this.capacityOfTowing = capacityOfTowing;
    }

    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isMiniSUV() {
        return miniSUV;
    }

    public void setMiniSUV(boolean miniSUV) {
        this.miniSUV = miniSUV;
    }

    public int getCapacityOfTowing() {
        return capacityOfTowing;
    }

    public void setCapacityOfTowing(int capacityOfTowing) {
        this.capacityOfTowing = capacityOfTowing;
    }

    @Override
    protected String getInfoAboutCar() {
        return super.getInfoAboutCar() + ", mini SUV: " + miniSUV;
    }

    @Override
    public String toString() {
        return "SUV { " +
                super.toString() +
                ", fourWheelDrive = " + fourWheelDrive +
                ", miniSUV = " + miniSUV +
                ", capacityOfTowing = " + capacityOfTowing +
                '}';
    }
}
