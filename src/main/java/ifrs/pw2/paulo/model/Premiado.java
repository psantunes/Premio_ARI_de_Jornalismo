package ifrs.pw2.paulo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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

  @Enumerated(EnumType.STRING)
  private Colocacao colocacao;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JsonManagedReference 
  private Set<Autor> autores;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JsonManagedReference
  private Set<Veiculo> veiculos;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "instensino_id")
  private InstEnsino instEnsino;
 
  public Premiado() { 
    autores = new HashSet<>();
    veiculos = new HashSet<>();
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

  public Set<Autor> getAutores() {
    return autores;
  }

  public void setAutores(Set<Autor> autores) {
    this.autores = autores;
  }

  public Set<Veiculo> getVeiculos() {
    return veiculos;
  }

  public void setVeiculos(Set<Veiculo> veiculos) {
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