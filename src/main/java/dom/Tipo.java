package dom;

public enum Tipo {

  ZAPATO(Categoria.CALZADO),
  CHOMBA(Categoria.SUPERIOR),
  PANUELO(Categoria.ACCESORIO),
  PANTALON(Categoria.INFERIOR),
  ZAPATILLA(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR);
  Categoria categoria;

  Tipo(Categoria categoria) { this.categoria = categoria; }

  boolean condiceConCategoria(Categoria unaCategoria){
    return categoria == unaCategoria;
  }
}

