package visao;

import java.util.ArrayList;
import dominio.SubClasseProduto;
import servico.SubClasseProdutoServico;

public class SubClasseProdutoVisao {
    private SubClasseProdutoServico srv;
    public SubClasseProdutoVisao(){
        this.srv = new SubClasseProdutoServico();
    }
    
    public void Imprimir(SubClasseProduto alvo) {
        System.out.println("Classe de Produto");
        System.out.println("Codigo: " + alvo.getCodigo());
        System.out.println("Descricao: " + alvo.getDescricao());
        System.out.println("Data de inclusao: " + alvo.getDataDeInclusao());
        System.out.println("Codigo da Classe: " + alvo.getCodigoClasse());
        System.out.println("----------------------------------------------------");
    }
    
    public void ImprimirPorLinha(SubClasseProduto scp) {
        System.out.println(scp);
    }

    public void ImprimirPorLinha(int chave){
        SubClasseProduto scp = this.srv.Ler(chave);
        this.ImprimirPorLinha(scp);
    }

    public void Exibir(){
        ArrayList<SubClasseProduto> lista = srv.Navegar();
        System.out.println("--------------------------------");
        for(SubClasseProduto scp : lista){
            this.Imprimir(scp);
        }
    }

    public void ExibirPorLinha(){
        ArrayList<SubClasseProduto> lista = this.srv.Navegar();
        System.out.println("--------------------------------");
        for(SubClasseProduto scp : lista){
            this.ImprimirPorLinha(scp);
        }
    }

    public void Criar(SubClasseProduto novo){
        this.srv.Adicionar(novo);
    }

    public void Editar(int chave, SubClasseProduto alt){
        SubClasseProduto scp = this.srv.Ler(chave);
        if(scp != null){
            scp.setDescricao(alt.getDescricao());
        }else{
            System.out.println("Item nao localizado");
        }
    }

    public void Remover(int chave){
        SubClasseProduto scp = this.srv.Ler(chave);
        if(scp != null){
            this.srv.Deletar(chave);
        }else{
            System.out.println("Item nao localizado");
        }
    }
}
