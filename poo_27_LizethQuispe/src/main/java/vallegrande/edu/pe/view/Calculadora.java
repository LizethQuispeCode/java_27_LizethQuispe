package vallegrande.edu.pe.view;

import javax.swing.*;

public class Calculadora extends JFrame { // 👈 Extiende JFrame para que funcione
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JPanel mainPanel;
    private JLabel lblResultado;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    // Paso 5️⃣ - Atributos
    private double numero1;
    private double numero2;

    // Paso 6️⃣ - Constructor de la clase
    public Calculadora() {
        setTitle("Calculadora"); // título de la ventana
        setContentPane(mainPanel); // panel principal generado en el .form
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar app al salir
        pack(); // ajusta el tamaño automático
        setSize(400, 300); // ancho x alto en píxeles
        setLocationRelativeTo(null); // centrar ventana en pantalla

        // Cambiar texto de los botones
        btnSumar.setText("Sumar");
        btnRestar.setText("Restar");
        btnMultiplicar.setText("Multiplicar");
        btnDividir.setText("Dividir");

        // Eventos para los botones
        btnSumar.addActionListener(e -> calcularYMostrar("sumar"));
        btnRestar.addActionListener(e -> calcularYMostrar("restar"));
        btnMultiplicar.addActionListener(e -> calcularYMostrar("multiplicar"));
        btnDividir.addActionListener(e -> calcularYMostrar("dividir"));
    }

    // Paso 5️⃣ - Métodos
    private double sumar() {
        return numero1 + numero2;
    }

    private double restar() {
        return numero1 - numero2;
    }

    private double multiplicar() {
        return numero1 * numero2;
    }

    private double dividir() {
        if (numero2 == 0) { // Validar división entre 0
            JOptionPane.showMessageDialog(this, "No se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2; // División correcta
    }

    // Paso 6️⃣ - Método para leer valores y mostrar resultado
    private void calcularYMostrar(String operacion) {
        try {
            numero1 = Double.parseDouble(txtNumero1.getText());
            numero2 = Double.parseDouble(txtNumero2.getText());

            double resultado;
            switch (operacion) {
                case "sumar":
                    resultado = sumar();
                    break;
                case "restar":
                    resultado = restar();
                    break;
                case "multiplicar":
                    resultado = multiplicar();
                    break;
                case "dividir":
                    resultado = dividir();
                    break;
                default:
                    resultado = 0;
            }

            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos.");
        }
    }


    // 7️⃣ Método main para ejecutar la ventana
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora().setVisible(true));
    }
}
