import dom.*;
import org.junit.jupiter.api.Test;

import static dom.Material.CUERO;
import static dom.Material.PIQUE;
import static dom.Tipo.CHOMBA;
import static dom.Tipo.ZAPATO;
import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {
  @Test
  public void elTipoDeUnaChombaVerdePiqueEsChomba() {
    assertEquals(chombaVerdePique().getTipo().toString(), "CHOMBA");
  }
  @Test
  public void chombaVerdePiqueNoTieneColorSecundario() {
    assertEquals(chombaVerdePique().getColorSecundario(), null);
  }
  @Test
  public void laTramaDelZapatoNegroDeCueroEsLisaPorDefecto() {
    assertEquals(zapatoNegroCuero().getTrama().toString(), "LISA");
  }

  @Test
  public void laCategoriaDeUnZapatoEsCalzadoSiempre() {
    assertEquals(zapatoNegroCuero().getCategoria().toString(), "CALZADO");
  }


  private Prenda chombaVerdePique() {
    return new BorradorPrenda()
        .ingresarTipo(CHOMBA)
        .ingresarMaterial(PIQUE)
        .ingresarColorPrimario(new Color(0, 255, 0))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();

  }

  private Prenda zapatoNegroCuero() {
    return new BorradorPrenda()
        .ingresarTipo(ZAPATO)
        .ingresarMaterial(CUERO)
        .ingresarColorPrimario(new Color(255, 255, 255))
        .ingresarColorSecundario(null)
        .ingresarTrama(null)
        .crearPrenda();
  }

}
