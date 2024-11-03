import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Informe dois numeros inteiros: ");
            System.out.print("X = ");
            int x = scan.nextInt();

            System.out.print("Y = ");
            int y = scan.nextInt();

            System.out.println("Adicao: " + Operacoes.Adicao(x, y));
            System.out.println("Subtracao: " + Operacoes.Subtracao(x, y));
            System.out.println("Multiplicacao: " + Operacoes.Multiplicacao(x, y));
            System.out.println("Divisao: " + Operacoes.Divisao(x, y));
        } catch (Exception e) {
            System.out.println("Erro: Valor informado nao esta correto!");
        }
    }
}
