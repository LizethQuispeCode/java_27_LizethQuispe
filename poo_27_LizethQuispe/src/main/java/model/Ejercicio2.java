

public class ejercicio2 {
    String marca;
    String modelo;

    public ejercicio1(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El " + this.marca + " " + this.modelo + " ha arrancado.");
    }
}

