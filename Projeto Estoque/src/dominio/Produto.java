package dominio;

import java.time.LocalDate;

public class Produto extends BaseParametro {
  private int codigoSubClasse;
  private double valor;
  
  public Produto() {
    super();
  }
  
  public Produto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoSubClasse, double valor) {
    super(codigo, descricao, dataDeInclusao);
    this.codigoSubClasse = codigoSubClasse;
    this.valor = valor;
  }

  public int getCodigoSubClasse() {
    return codigoSubClasse;
  }

  public void setCodigoSubClasse(int codigoSubClasse) {
    this.codigoSubClasse = codigoSubClasse;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Produto: " + codigo + "| Descricao: " + descricao + " | Data de Inclusao: " + dataDeInclusao + " | Codigo SubClasse: " + codigoSubClasse + " | Valor: " + valor; 
  }

}
