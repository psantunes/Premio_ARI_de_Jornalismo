package ifrs.pw2.paulo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Autor extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;

  @ManyToMany(mappedBy = "autores", fetch = FetchType.EAGER)
  @JsonBackReference
  private Set<Premiado> premiados;

  public Autor() { 
    this.premiados = new HashSet<>();
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
  public Set<Premiado> getPremiados() {
    return premiados;
  }
  public void setPremiados(Set<Premiado> premiados) {
    this.premiados = premiados;
  }

  @Override
  public String toString() {
    return "Autor [id=" + id + ", nome=" + nome + "]";
  } 
}
