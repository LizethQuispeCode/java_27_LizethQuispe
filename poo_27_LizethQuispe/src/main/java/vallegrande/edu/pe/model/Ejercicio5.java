package vallegrande.edu.pe.model;

public class Ejercicio5 {
    String nombre;
    int edad;

    public Ejercicio5(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("¡Se ha creado una nueva persona: " + this.nombre + "!");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }
}