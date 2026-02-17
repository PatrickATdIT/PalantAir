package atdit_2026.palantair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductivePalantAir implements PalantAir {
  private static final Logger log = LoggerFactory.getLogger( ProductivePalantAir.class );

  @Override
  public int getAirTemperature( ) {
    int result = 33;
    log.info( "PalantAir is predicting the air temperature as {}", result );
    return result;
  }

  @Override
  public int getWind( ) {
    int result = 50;
    log.info( "PalantAir is predicting the wind velocity as {}", result );
    return result;
  }
}
