package atdit_2026.weather.oracle;

/**
 * WeatherOracle provides forecasts for essential meteorological data.
 */
public interface WeatherOracle {

  /**
   * Returns the air temperature.
   * @return the temperature in degrees Celsius (°C).
   */
  int getTemperature();

  /**
   * Returns the wind speed.
   * @return the wind speed in kilometers per hour (km/h).
   */
  int getWind();

  /**
   * Returns the relative humidity level.
   * @return the humidity as a percentage (0-100%).
   */
  int getHumidity();

  /**
   * Returns the cumulative amount of precipitation.
   * @return the precipitation in millimeters per square meter (mm/m²).
   */
  int getPrecipitation();
}