package dom.QMP;

import dom.BorradorPrenda;
import dom.Color;
import dom.Prenda;

import static dom.Material.*;
import static dom.Tipo.*;

public class UniformeSanJuan extends Uniforme {

  public Prenda prendaSuperior() {
    return new BorradorPrenda()
        .ingresarTipo(CHOMBA)
        .ingresarMaterial(PIQUE)
        .ingresarColorPrimario(new Color(0, 255, 0))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

  public Prenda prendaInferior() {
    return new BorradorPrenda()
        .ingresarTipo(PANTALON)
        .ingresarMaterial(ACETATO)
        .ingresarColorPrimario(new Color(155, 155, 155))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

  public Prenda prendaCalzado() {
    return new BorradorPrenda()
        .ingresarTipo(ZAPATILLA)
        .ingresarMaterial(CUERO)
        .ingresarColorPrimario(new Color(0, 0, 0))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

}
