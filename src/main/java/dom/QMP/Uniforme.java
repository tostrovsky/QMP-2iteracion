package dom.QMP;

import dom.*;
import static dom.Tipo.*;
import static dom.Material.*;

public abstract class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;

  public Uniforme() {
    this.prendaSuperior = this.prendaSuperior();
    this.prendaInferior = this.prendaInferior();
    this.prendaCalzado = this.prendaCalzado();
  }

  public abstract Prenda prendaSuperior();
  public abstract Prenda prendaInferior();
  public abstract Prenda prendaCalzado();

}

