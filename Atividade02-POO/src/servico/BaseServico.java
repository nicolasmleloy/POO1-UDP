package servico;

import java.util.ArrayList;

public abstract class BaseServico<TDominio> {
    public abstract ArrayList<TDominio> Navegar();

    public abstract TDominio Ler(int chave);

    public abstract TDominio Editar(TDominio objeto);

    public abstract TDominio Adicionar(TDominio objeto);

    public abstract TDominio Deletar(int chave);
}
