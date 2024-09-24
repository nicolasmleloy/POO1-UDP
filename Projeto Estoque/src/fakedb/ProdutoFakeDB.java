package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    @Override
    public void preencherDados() {
        if(this.tabela == null){
            this.tabela = new ArrayList<>();
        }
        this.tabela.add(new Produto(1, "Picanha", LocalDate.now(), 1, 59.99));
        this.tabela.add(new Produto(2, "Suco de Laranja", LocalDate.now(), 2, 9.90));
        this.tabela.add(new Produto(3, "Queijo parmesao", LocalDate.now(), 3, 49.90));
        this.tabela.add(new Produto(4, "Limao", LocalDate.now(), 4, 5.99));
        this.tabela.add(new Produto(5, "Alface", LocalDate.now(), 5, 4.99));
    }    
}
