public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(7);


            // wywołanie metod z klasy Punkt
                Punkt.getSum(3, 5, 6);
                System.out.println(Punkt.roznica());
                System.out.println(Punkt.roznica(10, 5, 1));
                System.out.println(punktA.toString());
                System.out.println(Punkt.getValue());
    }
}
/* klasa Punkt */
class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    private static int pX = 1;
    private static int pY = 2;
    private static int pZ = 3;


    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */
    Punkt (){}

    public Punkt(int pX) {
        this.pX = pX;
    }

    public Punkt(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public static int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public static int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public static int getpZ() {
        return pZ * 10;
    }

    public void setpZ(int pZ) {
        this.pZ = pZ;
    }

    /* Stworzyć metody
                                a) suma - sumująca wszystkie wartości w klasie
                                b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
                                c) metody różnica mają wykonwywać dzialania :
                                    roznica(){ } i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
                                d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
*/

    public static void getSum(int pX, int pZ, int pY){
        int sum = pX + pZ + pY;
        System.out.println(sum);
    }
    public static int roznica(){
        return pX - pY - pZ;
    }
    public static int roznica(int x, int y, int z){
        return pX*x - pY*y - pZ*z;
    }

    @Override
    public String toString() {
        return "X = " + this.pX +", Y = "+ this.pY + ", Z = " + this.pZ;
    }

    public static String getValue(){
        return "X = " + getpX() +", Y = "+ getpY() + ", Z = " + getpZ();
    }

}