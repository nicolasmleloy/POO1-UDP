package dominio;

public class Veiculo extends BaseVeiculo {
    public Veiculo(){
        super();
    }
    
    public Veiculo(int codigo, String marca, String modelo, int anoFabricacao, double preco){
        super(codigo, marca, modelo, anoFabricacao, preco);
    }
    
}