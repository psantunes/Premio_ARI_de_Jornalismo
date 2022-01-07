package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Edicao;

@Path("/edicao")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class EdicaoWS {
 
  /** READ */
  @GET
  @Path("/list/{id}")
  @Transactional
  public Edicao list(@PathParam("id") int id) {
      return Edicao.findById(id);
  }

  /** READ ALL */
  @GET
  @Path("/list")
  @Transactional
  public List<Edicao> list() {
      return Edicao.listAll();
  }

}