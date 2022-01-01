package ifrs.pw2.paulo.model;

public class Categoria {

  private int id;
  private String name;

  public Categoria() {} 
  public Categoria(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Categoria [id=" + id + ", name=" + name + "]";
  }

}
