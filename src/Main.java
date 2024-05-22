

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        Double first = scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        Double second = scanner.nextDouble();
        System.out.println("Digite a operação que deseja fazer entra esses dois numeros");
        char operation = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch (operation){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println(first + " " + operation + " " + second + ": " + result);

    }
}