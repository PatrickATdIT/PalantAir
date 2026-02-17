package atdit_2026.palantair;

/**
 * Factory interface for creating instances of {@link PalantAir}.
 * <p>
 * This abstraction allows the application to decouple the creation logic
 * from the actual implementation, enabling easy switching between
 * different data sources (e.g., Mock, REST-API, or Database).
 */
public interface WeatherOracleFactory {

  /**
   * Creates and returns a {@code WeatherOracle} instance.
   * @return a fully initialized {@link PalantAir} implementation.
   */
  PalantAir get();
}
