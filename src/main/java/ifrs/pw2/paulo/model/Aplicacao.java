package ifrs.pw2.paulo.model;

import javax.transaction.Transactional;
import javax.ws.rs.POST;

public class Aplicacao {

  @POST
  @Transactional
  public static void main(String[] args) {

    Veiculo veiculo = new Veiculo();
    veiculo.setNome("Jornal do Comércio");
    System.out.println(veiculo);
    Veiculo.persist(veiculo);
	}

}
