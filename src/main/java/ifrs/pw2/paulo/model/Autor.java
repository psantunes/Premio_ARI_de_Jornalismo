package ifrs.pw2.paulo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Autor extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;

  public Autor() { }
  public Autor(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public Autor(String nome) {
    this.nome = nome;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return nome;
  }

  public void setName(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Autor [id=" + id + ", nome=" + nome + "]";
  }
 
}
