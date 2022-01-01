package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Veiculo;

@Path("/veiculo")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class VeiculoWS {

  @GET
  @Path("/list")
  @Produces(MediaType.APPLICATION_JSON)
  @Transactional
  public List<Veiculo> list() {
      return Veiculo.listAll();
  }

  @GET
  @Path("/list/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Transactional
  public Veiculo list(@PathParam("id") int id) {
      return Veiculo.findById(id);
  }

}
