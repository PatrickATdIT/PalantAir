package atdit_2026.palantair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete implementation of {@link PalantAirFactory}.
 * This factory provides a singleton instance of a WeatherOracle.
 */
public class ProductivePalantAirFactory implements PalantAirFactory {
  private static final Logger log = LoggerFactory.getLogger( ProductivePalantAirFactory.class );

  private static PalantAir instance;

  /**
   * Returns a singleton instance of the WeatherOracle.
   * In a real-world scenario, this could be configured via environment
   * variables or a configuration file.
   *
   * @return a cached WeatherOracle instance.
   */
  @Override
  public synchronized PalantAir getInstance( ) {
    if( instance == null ) {
      log.debug( "PalantAir instance does not exist yet; creating instance ..." );
      instance = new ProductivePalantAir( );
    }
    return instance;
  }

}
