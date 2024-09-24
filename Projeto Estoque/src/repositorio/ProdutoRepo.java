package repositorio;

import dominio.Produto;
import fakedb.ProdutoFakeDB;

public class ProdutoRepo extends BaseRepositorio<Produto> {
    private ProdutoFakeDB db;

    public ProdutoRepo(){
        this.db = new ProdutoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Produto Read(int chave) {
        for(Produto p : dados){
            if(chave == p.getCodigo()){
                return p;
            }
        }
        return null;
    }

    @Override
    public Produto Edit(Produto instancia) {
        Produto p = this.Read(instancia.getCodigo());
        if(p != null){
            p.setDescricao(instancia.getDescricao());
            return p;
        }else{
            return null;
        }
    }

    @Override
    public Produto Add(Produto instancia) {
        Produto p = this.dados.get(this.dados.size() - 1);
        instancia.setCodigo(p.getCodigo() + 1);        
        instancia.setCodigoSubClasse(p.getCodigoSubClasse() + 1);
        this.dados.add(instancia);
        return instancia;        
    }

    @Override
    public Produto Delete(int chave) {
        Produto p = this.Read(chave);
        if(p != null){
            this.dados.remove(p);
            return p;
        }else{
            return null;
        }
    }
    
}
