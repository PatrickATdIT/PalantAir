package atdit_2026.palantair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherOracleProduction implements PalantAir {
  private static final Logger log = LoggerFactory.getLogger( WeatherOracleProduction.class );

  @Override
  public int getTemperature( ) {
    int result = 33;
    log.info( "Forecasting temperature: {}", result );
    return result;
  }

  @Override
  public int getWind( ) {
    int result = 50;
    log.info( "Forecasting wind speed: {}", result );
    return result;
  }

  @Override
  public int getHumidity( ) {
    int result = 63;
    log.info( "Forecasting humidity: {}", result );
    return result;
  }

  @Override
  public int getPrecipitation( ) {
    int result = 0;
    log.info( "Forecasting precipitation: {}", result );
    return result;
  }
}
