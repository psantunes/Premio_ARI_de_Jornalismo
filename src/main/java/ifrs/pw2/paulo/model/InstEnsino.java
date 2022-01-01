package ifrs.pw2.paulo.model;

public class InstEnsino {

  private int id;
  private String nome;

  public InstEnsino() {}
  public InstEnsino(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  @Override
  public String toString() {
    return "InstEnsino [id=" + id + ", nome=" + nome + "]";
  }
  
}