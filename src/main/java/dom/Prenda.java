package dom;

import static dom.Trama.*;
import static java.util.Objects.isNull;

public class Prenda {
  Tipo tipo;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  Categoria categoria;


  public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario,Trama trama, Categoria categoria) {

    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.categoria = categoria;
  }

  Prenda crearPrenda (Tipo unTipo, Material material, Color colorPrimario, Color colorSecundario,Trama trama){
    Prenda nuevaPrenda = new BorradorPrenda()
        .ingresarTipo(unTipo)
        .ingresarMaterial(material)
        .ingresarColorPrimario(colorPrimario)
        .ingresarColorSecundario(colorSecundario)
        .ingresarTrama(trama)
        .crearPrenda();
    return nuevaPrenda;

  }

  public Tipo getTipo() {
    return tipo;
  }

  public Trama getTrama() {
    return trama;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Categoria getCategoria() {
    return categoria;
  }


  public Material getMaterial() {
    return material;
  }
}


