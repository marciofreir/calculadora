package cursojava;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Ler num1
        //Ler num2
        // +, -, *, /, %

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro valor: ");
        double Num1 = entrada.nextDouble();

        System.out.println("digite o segundo valor: ");
        double Num2 = entrada.nextDouble();

        System.out.println("qual operação deseja fazer? (+) (-) (*) (/) (%)");
        String op = entrada.next();

        //logic
        double resultado = "+".equals(op) ? Num1 + Num2 : 0;
        resultado = "-".equals(op) ? Num1 - Num2 : resultado;
        resultado = "*".equals(op) ? Num1 * Num2 : resultado;
        resultado = "/".equals(op) ? Num1 / Num2 : resultado;
        resultado = "%".equals(op) ? Num1 % Num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",
                Num1, op, Num2, resultado);

        entrada.close();
    }
}
