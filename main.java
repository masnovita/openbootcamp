public class Main {
    public static void main(String[] args) {

        // Primera part
        // Crear una función con tres parámetros que sean números que se suman entre sí.
        // Llamar a la función en el main y darle valores.
        int primerNum = 3;
        int segonNum = 7;
        int tercerNum = 5;

        int resultat = suma(primerNum, segonNum, tercerNum);
        System.out.println("La suma da como resultado : " + resultat);

        // Segona part
        // Crear una clase coche.
        // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        // Una función que incremente el número de puertas que tiene el coche.
        // Crear un objeto miCoche en el main y añadirle una puerta.
        // Mostrar el número de puertas que tiene el objeto.

        Coche seat = new Coche(2);
        seat.afegirPortes();
        System.out.println("Mi seat tiene " + seat.getnPortes() + " puertas.");

    }
    public static int suma(int op1, int op2, int op3) {
        return op1 + op2 + op3;
    }


}

class Coche {
    private int nPortes;

    // Constructor
    public Coche(int portes) {
        this.nPortes = portes;
    }
    public void afegirPortes() {
        this.nPortes++;
    }
    public int getnPortes() {
        return nPortes;
    }

}

