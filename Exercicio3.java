import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double valor1, valor2, resto;

        System.out.println("informe o primeiro valor: ");
        valor1 = Double.valueOf(sc.nextInt());
        System.out.println("informe o segundo valor: ");
        valor2 = Double.valueOf(sc.nextInt());

        System.out.println("MMC: " + mmc(valor1, valor2));
        System.out.println("MDC: " + mdc(valor1,valor2));
    }


    private static double mdc(double a, double b){
        while(b != 0){
            double r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static double mmc(double a, double b){
        return a * (b / mdc(a, b));
    }
}