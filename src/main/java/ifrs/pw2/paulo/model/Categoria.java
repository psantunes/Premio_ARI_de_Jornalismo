package ifrs.pw2.paulo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;

  public Categoria() {} 
  public Categoria(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

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
