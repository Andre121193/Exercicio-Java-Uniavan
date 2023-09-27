import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um valor: ");
            valores.add(sc.nextInt());
        }

        System.out.print("valores sem ordenação: " + valores);
        System.out.println();

        valores.sort(Comparator.naturalOrder());
        System.out.print("valores em ordem crecente: " + valores);
    }
}
