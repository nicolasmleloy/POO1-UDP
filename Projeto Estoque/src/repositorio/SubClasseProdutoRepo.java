package repositorio;

import dominio.SubClasseProduto;
import fakedb.SubClasseProdutoFakeDB;

public class SubClasseProdutoRepo extends BaseRepositorio<SubClasseProduto> {
    private SubClasseProdutoFakeDB db;

    public SubClasseProdutoRepo(){
        this.db = new SubClasseProdutoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public SubClasseProduto Read(int chave) {
        for(SubClasseProduto scp : dados){
            if(chave == scp.getCodigo()){
                return scp;
            }
        }
        return null;
    }

    @Override
    public SubClasseProduto Edit(SubClasseProduto instancia) {
        SubClasseProduto scp = this.Read(instancia.getCodigo());
        if(scp != null){
            scp.setDescricao(instancia.getDescricao());
            return scp;
        }else{
            return null;
        }
    }

    @Override
    public SubClasseProduto Add(SubClasseProduto instancia) {
        SubClasseProduto scp = this.dados.get(this.dados.size() - 1);
        instancia.setCodigo(scp.getCodigo() + 1);
        instancia.setCodigoClasse(scp.getCodigoClasse() + 1);
        this.dados.add(instancia);
        return instancia;
    }   

    @Override
    public SubClasseProduto Delete(int chave) {
        SubClasseProduto scp = this.Read(chave);
        if(scp != null){
            this.dados.remove(scp);
            return scp;
        }else{
            return null;
        }
    }
}
