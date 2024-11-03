package repositorio;

import dominio.Veiculo;
import fakedb.VeiculoFakeDB;

public class VeiculoRepositorio extends BaseRepositorio<Veiculo> {

    private VeiculoFakeDB db;

    public VeiculoRepositorio(){
        this.db = new VeiculoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Veiculo Read(int chave) {
        for (Veiculo veiculo : this.dados) {
            if(veiculo.getCodigo() == chave){
                return veiculo;
            }
        }
        return null;
    }

    @Override
    public Veiculo Edit(Veiculo instancia) {
        Veiculo veiculo = this.Read(instancia.getCodigo());
        if(veiculo != null){
            veiculo.setMarca(instancia.getMarca());
            veiculo.setModelo(instancia.getModelo());
            veiculo.setAnoFabricacao(instancia.getAnoFabricacao());
            veiculo.setPreco(instancia.getPreco());
            return veiculo;
        }else{
            return null;
        }
    }

    @Override
    public Veiculo Add(Veiculo instancia) {
        int posicao = this.dados.size() - 1;
        Veiculo veiculo = this.dados.get(posicao);
        int proxChave = veiculo.getCodigo() + 1;

        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public Veiculo Delete(int chave) {
        Veiculo veiculo = this.Read(chave);
        if(veiculo != null){
            this.dados.remove(veiculo);
            return veiculo;
        }else{
            return null;
        }
    }
    
}
