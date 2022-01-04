package ifrs.pw2.paulo;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ifrs.pw2.paulo.model.Veiculo;

@Path("/veiculo")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class VeiculoWS {

  /** CREATE */
  @POST
  @Path("/save")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response save(Veiculo veiculo) {
    veiculo.persist();
    return Response.created(URI.create("/veiculo/" + veiculo.getId())).build();
  }

  /** READ */
  @GET
  @Path("/list")
  @Transactional
  public List<Veiculo> list() {
      return Veiculo.listAll();
  }

  /** READ ALL */
  @GET
  @Path("/list/{id}")
  @Transactional
  public Veiculo list(@PathParam("id") int id) {
      return Veiculo.findById(id);
  }
 
  /** UPDATE */
  @PUT
  @Path("/{id}")
  @Transactional
  public Response update(@PathParam("id") int id, Veiculo veiculo) {
    Veiculo veiculoAtualizado = Veiculo.findById(id);
    if(veiculoAtualizado == null) {
        return Response.ok("Instituição de ensino não encontrada").type(MediaType.APPLICATION_JSON_TYPE).build();
    }
    veiculoAtualizado.setNome(veiculo.getNome());
    return Response.created(URI.create("/veiculo/" + veiculoAtualizado.getId())).build();
}

  /** DELETE */
  @DELETE
  @Path("/delete/{id}")
  @Transactional
  public void delete(@PathParam("id") int id) {
    Veiculo veiculo = Veiculo.findById(id);
        if(veiculo == null) {
            throw new NotFoundException();
        }
        veiculo.delete();
    }

}