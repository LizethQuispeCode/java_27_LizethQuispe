package vallegrande.edu.pe.model;

public class Ejercicio3 {
    double valor;

    public Ejercicio3(double numeroInicial) {
        this.valor = numeroInicial;
    }

    public double sumar(double otroNumero) {
        this.valor += otroNumero;
        return this.valor;
    }
}