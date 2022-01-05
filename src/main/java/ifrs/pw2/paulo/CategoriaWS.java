package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Categoria;

@Path("/categoria")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaWS {
   
  /** READ */
  @GET
  @Path("/list/{id}")
  @Transactional
  public Categoria list(@PathParam("id") int id) {
      return Categoria.findById(id);
  }

  /** READ ALL */
  @GET
  @Path("/list")
  @Transactional
  public List<Categoria> list() {
      return Categoria.listAll();
  }
}