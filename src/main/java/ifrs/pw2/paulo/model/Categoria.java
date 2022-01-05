package ifrs.pw2.paulo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Categoria extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;

  public Categoria() {} 

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getnome() {
    return nome;
  }

  public void setnome(String nome) {
    this.nome = nome;
  }
  @Override
  public String toString() {
    return "Categoria [id=" + id + ", nome=" + nome + "]";
  }

 
}
