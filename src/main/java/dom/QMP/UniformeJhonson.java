package dom.QMP;

import dom.BorradorPrenda;
import dom.Color;
import dom.Prenda;

import static dom.Material.*;
import static dom.Tipo.*;

public class UniformeJhonson extends Uniforme {

  public Prenda prendaSuperior() {
    return new BorradorPrenda()
        .ingresarTipo(CAMISA)
        .ingresarMaterial(TELA)
        .ingresarColorPrimario(new Color(0, 0, 0))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

  public Prenda prendaInferior() {
    return new BorradorPrenda()
        .ingresarTipo(PANTALON)
        .ingresarMaterial(VESTIR)
        .ingresarColorPrimario(new Color(255, 255, 255))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

  public Prenda prendaCalzado() {
    return new BorradorPrenda()
        .ingresarTipo(ZAPATO)
        .ingresarMaterial(CUERO)
        .ingresarColorPrimario(new Color(255, 255, 255))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

}
