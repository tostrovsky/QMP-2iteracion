package dom;

import static dom.Trama.LISA;
import static java.util.Objects.isNull;

public class BorradorPrenda {
  Tipo tipo;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  Categoria categoria;

  public BorradorPrenda ingresarTipo(Tipo unTipo){
    this.tipo = unTipo;
    this.categoria = unTipo.categoria;
    return this;
  }

  public BorradorPrenda ingresarMaterial(Material material){
    this.material = material;
    return this;
  }

  public BorradorPrenda ingresarColorPrimario(Color color){
    this.colorPrimario = color;
    return this;
  }

  public BorradorPrenda ingresarColorSecundario(Color color){
    this.colorSecundario = color;
    return this;
  }
  public BorradorPrenda ingresarTrama(Trama trama){
    this.trama = trama;
    return this;
  }

  public Prenda crearPrenda() {

    validarAtributos();
    if(trama == null){
      trama = LISA;
    }
    return new Prenda(tipo, material, colorPrimario, colorSecundario, trama, categoria);
  }

  void validarAtributos() {
    if (isNull(tipo) || isNull(material) || isNull(categoria) || isNull(colorPrimario)) {
      throw new PrendaInvalidaException("Faltan datos");
    }
    if (!tipo.condiceConCategoria(categoria)) {
      throw new PrendaInvalidaException("Tipo no condice con categoria");
    }
  }

  static class PrendaInvalidaException extends RuntimeException {
    public PrendaInvalidaException(String causa) {
      super("La prenda es invalida porque " + causa);
    }
  }

}
