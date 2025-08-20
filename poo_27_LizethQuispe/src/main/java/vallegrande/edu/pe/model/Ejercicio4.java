package vallegrande.edu.pe.model;

public class Ejercicio4 {
    String nombre;
    String cargo;

    public Ejercicio4(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public void actualizarCargo(String nuevoCargo) {
        System.out.println("El cargo de " + this.nombre + " era " + this.cargo + ".");
        this.cargo = nuevoCargo;
        System.out.println("Ahora su nuevo cargo es " + this.cargo + ".");
    }
}