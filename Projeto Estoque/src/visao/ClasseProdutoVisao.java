package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoVisao {
  public void Exibir(){

    ClasseProdutoFakeDB fakedb = new ClasseProdutoFakeDB();
    ArrayList<ClasseProduto> tab = fakedb.getTabela();
    for(ClasseProduto cp : tab){
      this.imprimir(cp);
    }

  }

  private void imprimir(ClasseProduto alvo){
    System.out.println("Classe de Produto");
    System.out.println("Código: " + alvo.getCodigo());
    System.out.println("Descrição: " + alvo.getDescricao());
    System.out.println("Data de inclusão: " + alvo.getDataDeInclusao());
  }
}
