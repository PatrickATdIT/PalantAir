package atdit_2026.palantair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductivePalantAirTest {
  private PalantAir cut;

  @BeforeEach
  void setup( ) {
    cut = new ProductivePalantAir( );
  }

  @Test
  void getTemperature( ) {
    var exp = 33;
    var act = cut.getAirTemperature( );
    Assertions.assertEquals( exp, act );
  }

  @Test
  void getWind( ) {
    var exp = 50;
    var act = cut.getWind( );
    Assertions.assertEquals( exp, act );
  }
}