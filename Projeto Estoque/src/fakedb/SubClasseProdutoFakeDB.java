package fakedb;

import java.util.ArrayList;
import dominio.SubClasseProduto;

public class SubClasseProdutoFakeDB extends BaseFakeDB<SubClasseProduto> {

    @Override
    public void preencherDados() {
        if(this.tabela == null){
            this.tabela = new ArrayList<>();
        }

        this.tabela.add(new SubClasseProduto(1, "Carne bovina", LocalDate.now(), 1));
        this.tabela.add(new SubClasseProduto(2, "Sucos", LocalDate.now(), 2));
        this.tabela.add(new SubClasseProduto(3, "Queijos", LocalDate.now(), 3));
        this.tabela.add(new SubClasseProduto(4, "Frutas citricas", LocalDate.now(), 4));
        this.tabela.add(new SubClasseProduto(5, "Folhosas", LocalDate.now(), 5));
    }

}
