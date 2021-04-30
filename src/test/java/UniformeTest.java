import dom.QMP.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class UniformeTest {
  @Test
  void elUniformeSanJuanTieneUnaChombaPique(){
    assertEquals(uniformeSanJuan().prendaSuperior().getTipo().toString(), "CHOMBA");
    assertEquals(uniformeSanJuan().prendaSuperior().getMaterial().toString(), "PIQUE");

  }
  @Test
  void elUniformeSanJuanNoTieneZapatosComoCalzado(){
    assertNotEquals(uniformeSanJuan().prendaCalzado().getTipo().toString(), "ZAPATO");
  }

  private UniformeSanJuan uniformeSanJuan(){
    return new UniformeSanJuan();
  }

}
