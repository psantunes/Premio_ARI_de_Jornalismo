package ifrs.pw2.paulo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Edicao extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int nroEdicao;
  private int ano;

  public Edicao() {}


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
