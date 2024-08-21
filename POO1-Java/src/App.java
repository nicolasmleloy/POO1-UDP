import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = s.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = s.nextInt();
        System.out.print("Informe sua altura: ");
        double altura = s.nextDouble();
        System.out.print(nome + " tem " + altura + " de altura e " + idade + " anos");
    }
}
