package ifrs.pw2.paulo.model;

public enum Colocacao {
  PRIMEIRO_LUGAR("1º lugar"),
  SEGUNDO_LUGAR("2º lugar"),
  TERCEIRO_LUGAR("3º lugar"),
  QUARTO_LUGAR("4º lugar"),
  MENCAO_HONROSA("Menção Honrosa"),
  PREMIO_ADICIONAL("Prêmio adicional");
  
  private final String colocacao;

  private Colocacao(String colocacao) {
    this.colocacao = colocacao;
  }

  public String getColocacao() {
    return colocacao;
  }

  
}


