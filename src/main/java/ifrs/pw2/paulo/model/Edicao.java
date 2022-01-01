package ifrs.pw2.paulo.model;

public class Edicao {

  private int id;
  private int nroEdicao;
  private int ano;

  public Edicao() {}
  public Edicao(int id, int nroEdicao, int ano) {
    this.id = id;
    this.nroEdicao = nroEdicao;
    this.ano = ano;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getNroEdicao() {
    return nroEdicao;
  }
  public void setNroEdicao(int nroEdicao) {
    this.nroEdicao = nroEdicao;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  @Override
  public String toString() {
    return "Edicao [ano=" + ano + ", id=" + id + ", nroEdicao=" + nroEdicao + "]";
  }

}
