import dominio.ClasseProduto;
import dominio.Produto;
import dominio.SubClasseProduto;
import visao.ClasseProdutoVisao;
import visao.ProdutoVisao;
import visao.SubClasseProdutoVisao;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
      ClasseProdutoVisao cpVisao = new ClasseProdutoVisao();
      SubClasseProdutoVisao scpVisao = new SubClasseProdutoVisao();
      ProdutoVisao pVisao = new ProdutoVisao();
 
      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();
      pVisao.ExibirPorLinha();

      System.out.println("Criando uma nova instancia.");
      ClasseProduto cpNovo = new ClasseProduto(0, "Higiene", LocalDate.now());
      SubClasseProduto scpNovo = new SubClasseProduto(0, "Sabao", LocalDate.now(), 0);
      Produto pNovo = new Produto(0, "Sabao em po", LocalDate.now(), 0, 14.90);
      cpVisao.Criar(cpNovo);
      cpVisao.ImprimirPorLinha(cpNovo);
      scpVisao.Criar(scpNovo);
      scpVisao.ImprimirPorLinha(scpNovo);
      pVisao.Criar(pNovo);
      pVisao.ImprimirPorLinha(pNovo);

      System.out.println("--------------------------------------------------------");
      System.out.println("Alterando uma instancia.");
      ClasseProduto cpAlterado = new ClasseProduto();
      SubClasseProduto scpAlterado = new SubClasseProduto();
      Produto pAlterado = new Produto(); 
      cpAlterado.setCodigo(0);
      cpAlterado.setDescricao("Teste de alteracao cp");
      scpAlterado.setCodigo(0);
      scpAlterado.setDescricao("Teste de alteracao scp");
      pAlterado.setCodigo(0);
      pAlterado.setDescricao("Teste de alteracao p");
      pAlterado.setValor(21.90);

      cpVisao.Editar(6, cpAlterado);
      cpVisao.ImprimirPorLinha(6);
      scpVisao.Editar(6, scpAlterado);
      scpVisao.ImprimirPorLinha(6);
      pVisao.Editar(6, pAlterado);
      pVisao.ImprimirPorLinha(6);
      System.out.println("--------------------------------------------------------");

      
      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();
      pVisao.ExibirPorLinha();

      System.out.println("Removendo o item 6.");
      cpVisao.Remover(6);
      scpVisao.Remover(6);
      pVisao.Remover(6);

      System.out.println("--------------------------------------------------------");        
      System.out.println("Imprimindo tudo.");
      cpVisao.ExibirPorLinha();
      scpVisao.ExibirPorLinha();
      pVisao.ExibirPorLinha();
    }
}
