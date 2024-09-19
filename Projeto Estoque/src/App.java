import dominio.ClasseProduto;
import dominio.SubClasseProduto;
import visao.ClasseProdutoVisao;
import visao.SubClasseProdutoVisao;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
      ClasseProdutoVisao cpVisao = new ClasseProdutoVisao();
      SubClasseProdutoVisao scpVisao = new SubClasseProdutoVisao();
 
      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();

      System.out.println("Criando uma nova instancia.");
      ClasseProduto cpNovo = new ClasseProduto(0, "Teste cp", LocalDate.now());
      SubClasseProduto scpNovo = new SubClasseProduto(0, "Teste scp", LocalDate.now(), 0);
      cpVisao.Criar(cpNovo);
      cpVisao.ImprimirPorLinha(cpNovo);
      scpVisao.Criar(scpNovo);
      scpVisao.ImprimirPorLinha(scpNovo);

      System.out.println("--------------------------------------------------------");        
      System.out.println("Alterando uma instancia.");
      ClasseProduto cpAlterado = new ClasseProduto();
      SubClasseProduto scpAlterado = new SubClasseProduto(); 
      cpAlterado.setCodigo(0);
      cpAlterado.setDescricao("Teste de alteracao cp");
      cpAlterado.setDataDeInclusao(LocalDate.now());
      scpAlterado.setCodigo(0);
      scpAlterado.setDescricao("Teste de alteracao scp");
      scpAlterado.setDataDeInclusao(LocalDate.now());
      scpAlterado.setCodigoClasse(0);

      cpVisao.Editar(6, cpAlterado);
      cpVisao.ImprimirPorLinha(6);
      scpVisao.Editar(6, scpAlterado);
      scpVisao.ImprimirPorLinha(6);

      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();

      System.out.println("Removendo o item 6.");
      cpVisao.Remover(6);
      scpVisao.Remover(6);

      System.out.println("--------------------------------------------------------");        
      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();
    }
}
