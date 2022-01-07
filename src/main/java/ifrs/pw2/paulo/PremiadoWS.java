package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Premiado;

@Path("/premiado")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class PremiadoWS {
    
  /** READ */
  @GET
  @Path("/list/{id}")
  @Transactional
  public Premiado list(@PathParam("id") int id) {
    return Premiado.findById(id);
  }

  /** READ ALL */
  @GET
  @Path("/list")
  @Transactional
  public List<Premiado> list() {
    return Premiado.listAll();
  }

  /** PREMIADOS POR ANO */
  @GET
  @Path("/ano/{ano}")
  @Transactional
  public List<Premiado> premios_por_ano(@PathParam("ano") int ano) {
    List<Premiado> lista = Premiado.list("edicao.ano", ano);
    return lista;
  }
  
  /** BUSCA PRÊMIOS POR AUTOR */
  @GET
  @Path("/autor/{id}")
  @Transactional
  public List<Premiado> premios_por_autor(@PathParam("id") int id) {
    List<Premiado> lista = Premiado.list("autores", id);
    return lista;
  }
  
}