package visao;

import java.util.ArrayList;

import dominio.Produto;
import servico.ProdutoServico;

public class ProdutoVisao {
    private ProdutoServico srv;

    public ProdutoVisao(){
        this.srv = new ProdutoServico();
    }

    public void Imprimir(Produto alvo){
        System.out.println("Classe de Produto");
        System.out.println("Codigo: " + alvo.getCodigo());
        System.out.println("Descricao: " + alvo.getDescricao());
        System.out.println("Data de inclusao: " + alvo.getDataDeInclusao());
        System.out.println("Codigo da Classe: " + alvo.getCodigoSubClasse());
        System.out.println("Valor: " + alvo.getValor());
        System.out.println("----------------------------------------------------");
    }

    public void ImprimirPorLinha(Produto p){
        System.out.println(p);
    }

    public void ImprimirPorLinha(int chave){
        Produto p = this.srv.Ler(chave);
        this.ImprimirPorLinha(p);
    }

    public void Exibir(){
        ArrayList<Produto> lista = this.srv.Navegar();
        for(Produto p : lista){
            this.Imprimir(p);
        }
        System.out.println("--------------------------------");
    }

    public void ExibirPorLinha(){
        ArrayList<Produto> lista = this.srv.Navegar();
        for(Produto p : lista){
            this.ImprimirPorLinha(p);
        }
        System.out.println("--------------------------------");
    }

    public void Criar(Produto novo){
        this.srv.Adicionar(novo);
    }

    public void Editar(int chave, Produto alt){
        Produto p = this.srv.Ler(chave);
        if(p != null){
            p.setDescricao(alt.getDescricao());
        }else{
            System.out.println("Item nao localizado");
        }
    }

    public void Remover(int chave){
        Produto p = this.srv.Ler(chave);
        if(p != null){
            this.srv.Deletar(chave);
        }else{
            System.out.println("Item nao localizado");
        }
    }
}
