package visao;

import java.util.ArrayList;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {
  private ClasseProdutoServico srv;
  
  public ClasseProdutoVisao(){
    this.srv = new ClasseProdutoServico();
  }
  
  public void Imprimir(ClasseProduto alvo){
    System.out.println("Classe de Produto");
    System.out.println("Codigo: " + alvo.getCodigo());
    System.out.println("Descricao: " + alvo.getDescricao());
    System.out.println("Data de inclusao: " + alvo.getDataDeInclusao());
    System.out.println("----------------------------------------------------");
  }
  
  public void ImprimirPorLinha(ClasseProduto cp) {
    System.out.println(cp);
  }
  
  public void ImprimirPorLinha(int chave){
    ClasseProduto cp = this.srv.Ler(chave);
    this.ImprimirPorLinha(cp);
  }
  
  public void Exibir(){
    ArrayList<ClasseProduto> lista = srv.Navegar();
    System.out.println("--------------------------------");
    for (ClasseProduto cp : lista) {
      this.Imprimir(cp);
    }
  }
  
  public void ExibirPorLinha(){
    ArrayList<ClasseProduto> lista = this.srv.Navegar();
    System.out.println("--------------------------------");
    for(ClasseProduto cp : lista){
      this.ImprimirPorLinha(cp);
    }  
  }
  
  
  public void Criar(ClasseProduto novo){
    this.srv.Adicionar(novo);
  }

  public void Editar(int chave, ClasseProduto alt){
    ClasseProduto cp = this.srv.Ler(chave);
    if(cp != null){
      cp.setDescricao(alt.getDescricao());
    }else{
      System.out.println("Item nao localizado");
    }
  }

  public void Remover(int chave){
    ClasseProduto cp = this.srv.Ler(chave);
    if(cp != null){
      this.srv.Deletar(chave);
    }else{
      System.out.println("Item nao localizado");
    }
  }
}
