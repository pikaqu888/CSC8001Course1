import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class for Earthquake class.
 */
class EarthquakeTest {
    private double magnitudeTest = 8.6;
    private double latitudeTest = 34.5;
    private double longitudeTest = 55.3;
    private int earthquakeEventYearTest = 1981;

    public Earthquake createEarthquake()
    {
        return new Earthquake(magnitudeTest, latitudeTest, longitudeTest, earthquakeEventYearTest);
    }


    @Test
    void getMagnitude()
    {
        Earthquake earthquake = createEarthquake();
        assertEquals(magnitudeTest, earthquake.getMagnitude());

    }

    @Test
    void getLatitude()
    {
        Earthquake earthquake = createEarthquake();
        assertEquals(latitudeTest, earthquake.getLatitude());
    }

    @Test
    void getLongitude()
    {
        Earthquake earthquake = createEarthquake();
        assertEquals(longitudeTest, earthquake.getLongitude());
    }

    @Test
    void getEarthquakeEventYear()
    {
        Earthquake earthquake = createEarthquake();
        assertEquals(earthquakeEventYearTest, earthquake.getEarthquakeEventYear());
    }
}