import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura;
        double alturaIdeal = 0;
        char sexo;

        System.out.println("informe a altura altura em metros");
        altura = sc.nextDouble();
        System.out.println("informe se é homem ou mulher (H/M)");
        sexo = sc.next().charAt(0);

        if (sexo == 'H'){
            alturaIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'M'){
            alturaIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal para esta pessoa é de: " + alturaIdeal);
    }
}
