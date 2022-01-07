package ifrs.pw2.paulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

  /** BUSCA POR AUTOR */
  @GET
  @Path("{nome}")
  @Transactional
  public List<Autor> busca_por_autor(@PathParam("nome") String autor) {
    String transformaEmSubstring = "%" + autor + "%";
    List<Autor> lista = Autor.list("nome like ?1", transformaEmSubstring);
    return lista;
  }

  /** RANKING */
  @GET
  @Path("/ranking")
  @Transactional
  public List<Entry<String, Integer>> ranking_por_autor() {
    Map<String, Integer> iteraLista = new LinkedHashMap<String, Integer>();
    List<Autor> lista = Autor.listAll();
    for(Autor autor : lista) {
      iteraLista.put(autor.getNome(),autor.getPremiados().size());
    }

    List<Entry<String, Integer>> listaRankeada = new ArrayList<>(iteraLista.entrySet());
		listaRankeada.sort(Entry.comparingByValue());
    Collections.reverse(listaRankeada);
    return listaRankeada;
  }
}
