package ifrs.pw2.paulo.model;

public class Aplicacao {

  public static void main(String[] args) {

    Autor autor1 = new Autor("Patricia Comunello");
    System.out.println(autor1);


    Veiculo veiculo1 = new Veiculo(1, "Zero Hora");
    System.out.println(veiculo1);

    InstEnsino instEnsino1 = new InstEnsino(1, "UFRGS");
    System.out.println(instEnsino1);

    Categoria categoria1 = new Categoria(1, "Jornalismo Impresso");
    System.out.println(categoria1);

    Edicao edicao1 = new Edicao(1, 1, 1962);
    System.out.println(edicao1);


    Premiado premiado1 = new Premiado();
    premiado1.setAutor(autor1);
    premiado1.setCategoria(categoria1);
    premiado1.setEdicao(edicao1);
    premiado1.setVeiculo(veiculo1);    
    premiado1.setLink("https://www.ari.org.br/noticias/conhecas-os-vencedores-do-premio-ari-banrisul-2020/");    
    premiado1.setNome("nome da reportagem");
    premiado1.setColocacao(Colocacao.PRIMEIRO_LUGAR);
    System.out.println(premiado1);

	}

}
