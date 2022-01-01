package ifrs.pw2.paulo.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Veiculo extends PanacheEntity {

  private int id;
  private String nome;

  public Veiculo() {}
  public Veiculo(int id, String nome) {
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
}
