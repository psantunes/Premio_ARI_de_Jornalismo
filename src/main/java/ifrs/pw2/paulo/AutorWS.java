package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Autor;

@Path("/autor")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class AutorWS {
    
  /** READ */
  @GET
  @Path("/list/{id}")
  @Transactional
  public Autor list(@PathParam("id") int id) {
      return Autor.findById(id);
  }

  /** READ ALL */
  @GET
  @Path("/list")
  @Transactional
  public List<Autor> list() {
      return Autor.listAll();
  }
}