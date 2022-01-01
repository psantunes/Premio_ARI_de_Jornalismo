package ifrs.pw2.paulo.model;

public class Premiado {

  private int id;
  private String nome;
  private String link;
  private Edicao edicao;
  private Categoria categoria;
  private Colocacao colocacao;
  private Autor autor;
  private Veiculo veiculo;
  private InstEnsino instEnsino;
 
  public Premiado() {}
  public Premiado(String nome, String link, Edicao edicao, Categoria categoria, Colocacao colocacao, Autor autor,
      Veiculo veiculo, InstEnsino instEnsino) {
    this.nome = nome;
    this.link = link;
    this.edicao = edicao;
    this.categoria = categoria;
    this.colocacao = colocacao;
    this.autor = autor;
    this.veiculo = veiculo;
    this.instEnsino = instEnsino;
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

  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  public Edicao getEdicao() {
    return edicao;
  }
  public void setEdicao(Edicao edicao) {
    this.edicao = edicao;
  }
  public Categoria getCategoria() {
    return categoria;
  }
  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
  public Colocacao getColocacao() {
    return colocacao;
  }
  public void setColocacao(Colocacao colocacao) {
    this.colocacao = colocacao;
  }
  public Autor getAutor() {
    return autor;
  }
  public void setAutor(Autor autor) {
    this.autor = autor;
  }
  public Veiculo getVeiculo() {
    return veiculo;
  }
  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }
  public InstEnsino getInstEnsino() {
    return instEnsino;
  }
  public void setInstEnsino(InstEnsino instEnsino) {
    this.instEnsino = instEnsino;
  }
  @Override
  public String toString() {
    return "Premiado [autor=" + autor + ", categoria=" + categoria + ", colocacao=" + colocacao + ", edicao=" + edicao
        + ", id=" + id + ", instEnsino=" + instEnsino + ", link=" + link + ", nome=" + nome + ", veiculo=" + veiculo
        + "]";
  }
  
}