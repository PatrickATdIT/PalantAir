package atdit_2026.palantair;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductivePalantAirFactoryTest {
  private PalantAirFactory cut;

  @BeforeEach
  void setup( ) {
    cut = new ProductivePalantAirFactory( );
  }

  @Test
  void getInstanceMustReturnInstance( ) {
    var act = cut.getInstance( );
    Assertions.assertNotNull( act );
  }

  @Test
  void getInstanceMustReturnSameInstance( ) {
    var exp = cut.getInstance( );
    var act = cut.getInstance( );
    Assertions.assertEquals( exp, act );
  }
}