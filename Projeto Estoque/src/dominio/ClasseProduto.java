package dominio;

import java.time.LocalDate;

public class ClasseProduto extends BaseParametro {
    public ClasseProduto(){
        super();
    }
    
    @Override
    public String toString() {
        return "Classe Produto: " + codigo + " | Descricao: " + descricao + "| Data de Inclusao: " + dataDeInclusao;    
    }


    public ClasseProduto(int codigo, String descricao, LocalDate dataDeInclusao){
        super(codigo, descricao, dataDeInclusao);
    }
}
