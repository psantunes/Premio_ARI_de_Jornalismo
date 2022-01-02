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

import ifrs.pw2.paulo.model.InstEnsino;

@Path("/universidade")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class InstEnsinoWS {

  @GET
  @Path("/list")
  @Transactional
  public List<InstEnsino> list() {
      return InstEnsino.listAll();
  }

  @GET
  @Path("/list/{id}")
  @Transactional
  public InstEnsino list(@PathParam("id") int id) {
      return InstEnsino.findById(id);
  }

  @POST
  @Path("/save")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response save(InstEnsino instEnsino) {
    instEnsino.persist();
    return Response.created(URI.create("/instEnsino/" + instEnsino.getId())).build();
  }

  @PUT
  @Path("/{id}")
  @Transactional
  public Response update(@PathParam("id") int id, InstEnsino instEnsino) {
    InstEnsino instEnsinoAtualizada = InstEnsino.findById(id);
    if(instEnsinoAtualizada == null) {
        return Response.ok("Instituição de ensino não encontrada").type(MediaType.APPLICATION_JSON_TYPE).build();
    }
    instEnsinoAtualizada.setNome(instEnsino.getNome());
    return Response.created(URI.create("/instEnsino/" + instEnsinoAtualizada.getId())).build();
}

  @DELETE
  @Path("/delete/{id}")
  @Transactional
  public void delete(@PathParam("id") int id) {
    InstEnsino instEnsino = InstEnsino.findById(id);
        if(instEnsino == null) {
            throw new NotFoundException();
        }
        instEnsino.delete();
    }

}