import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, somatoria;
        ArrayList<Integer> valores = new ArrayList();

        for (int i = 0; i < 3; i++){
            System.out.println("informe o valor: ");
            valor = sc.nextInt();
            valores.add(valor);
        }

        valores.sort(Comparator.naturalOrder());

        somatoria = valores.get(1) + valores.get(2);

        System.out.println("O resultado da soma dos maiores valores informados é " + somatoria);

    }
}
