package ifrs.pw2.paulo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ifrs.pw2.paulo.model.Edicao;
import ifrs.pw2.paulo.model.Premiado;

@Path("/search")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
public class SearchWS {

  /** PREMIADOS POR ANO */
  @GET
  @Path("/ano")
  @Transactional
  public List<Premiado> search_by_year(@QueryParam("ano") int ano) {
        List<Premiado> lista = Premiado.list("edicao.ano", ano);
		return lista;
    }

}
