package atdit_2026.palantair;

/**
 * PalantAir provides forecasts for essential meteorological data.
 */
public interface PalantAir {

  /**
   * Returns the air temperature.
   * @return the temperature in degrees Celsius (°C).
   */
  int getAirTemperature();

  /**
   * Returns the wind speed.
   * @return the wind speed in kilometers per hour (km/h).
   */
  int getWind();
}