package fakedb;

import java.util.ArrayList;

import dominio.Veiculo;

public class VeiculoFakeDB extends BaseFakeDB<Veiculo> {
    public VeiculoFakeDB(){
        super();
    }
    
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Veiculo>();
        this.tabela.add(new Veiculo(1, "Volkswagem", "Polo", 2024, 114900.00));
        this.tabela.add(new Veiculo(2, "Peugeot", "208", 2022, 92000.00));
        this.tabela.add(new Veiculo(3, "Hyundai", "HB20", 2018, 55000.00));
    }
}
