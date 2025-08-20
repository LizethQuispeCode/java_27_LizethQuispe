package vallegrande.edu.pe.model;


public class Main {

    public static void main(String[] args) {
        // --- Prueba para ejercicio1 (Carro) ---
        System.out.println("--- Prueba para ejercicio1 ---");
        Ejercicio2 miCarro = new Ejercicio2("Toyota", "Corolla");
        miCarro.arrancar();
        System.out.println("\n");

        // --- Prueba para ejercicio2 (Calculadora) ---
        System.out.println("--- Prueba para ejercicio2 ---");
        Ejercicio3 miCalculadora = new Ejercicio3(10);
        double resultado = miCalculadora.sumar(5);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("\n");

        // --- Prueba para ejercicio3 (Empleado) ---
        System.out.println("--- Prueba para ejercicio3 ---");
        Ejercicio4 empleado1 = new Ejercicio4("Juan Pérez", "Desarrollador Junior");
        empleado1.actualizarCargo("Desarrollador Senior");
        System.out.println("\n");

        // --- Prueba para ejercicio4 (Persona) ---
        System.out.println("--- Prueba para ejercicio4 ---");
        Ejercicio5 nuevaPersona = new Ejercicio5("María", 30);
        nuevaPersona.saludar();
    }
}