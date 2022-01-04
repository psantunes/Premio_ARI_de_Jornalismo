package ifrs.pw2.paulo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Premiado extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String nome;
  private String link;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "edicao_id")
  private Edicao edicao;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "categoria_id")
  private Categoria categoria;
  private Colocacao colocacao;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(name="Premiado_Autor", joinColumns={@JoinColumn(name="premiado_id")}, inverseJoinColumns={@JoinColumn(name="autor_id")})
  private List<Autor> autores;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name="Premiado_Veiculo", joinColumns={@JoinColumn(name="premiado_id")}, inverseJoinColumns={@JoinColumn(name="veiculo_id")})
  private List<Veiculo> veiculos;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "instensino_id")
  private InstEnsino instEnsino;
 
  public Premiado() {
    this.autores = new ArrayList<>();
  }
  public Premiado(String nome, String link, Edicao edicao, Categoria categoria, String colocacao, List<Autor> autores,
    List<Veiculo> veiculos, InstEnsino instEnsino) {
    this.nome = nome;
    this.link = link;
    this.edicao = edicao;
    this.categoria = categoria;
    this.colocacao = Colocacao.valueOf(colocacao);
    this.autores = autores;
    this.veiculos = veiculos;
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

  public List<Autor> getAutores() {
    return autores;
  }
  public void setAutores(List<Autor> autores) {
    this.autores = autores;
  }

  public List<Veiculo> getVeiculos() {
    return veiculos;
  }
  public void setVeiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }
  public InstEnsino getInstEnsino() {
    return instEnsino;
  }
  public void setInstEnsino(InstEnsino instEnsino) {
    this.instEnsino = instEnsino;
  }
  @Override
  public String toString() {
    return "Premiado [autores=" + autores + ", categoria=" + categoria + ", colocacao=" + colocacao + ", edicao="
        + edicao + ", id=" + id + ", instEnsino=" + instEnsino + ", link=" + link + ", nome=" + nome + ", veiculos="
        + veiculos + "]";
  }
  
}