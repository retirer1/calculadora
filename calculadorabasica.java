import javax.swing.*;
public class calculadorabasica {
    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        String operador = JOptionPane.showInputDialog("Escolha o operador entre + - * /: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
            break;
            case "-":
                resultado = num1 - num2;
            break;
            case "*":
                resultado = num1 * num2;
            break;
            case "/":
                if (num2 != 0) {
                resultado = num1 / num2;
                }
            break;
            default:JOptionPane.showMessageDialog(null, "Operador Inavalido");
        }
        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
    }

}
