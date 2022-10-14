public class E01 {
    public static void main(String[] args) {
        Suma(10, 12, 14);
        Coche nuevoCoche = new Coche();
        nuevoCoche.inPuerta();
        System.out.println("Numero de puertas: " + nuevoCoche.puertas);
    }

    public static void Suma(int a, int b, int c) {
        int suma = a+b+c;
        System.out.println("Suma:" + suma);
    }
}
class Coche {
    public int puertas = 0;

    public void inPuerta() {
        this.puertas++;
    }
}
