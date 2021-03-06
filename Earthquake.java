/**
 * A class which contains earthquake information.
 */
public class Earthquake
{
    private double magnitude;
    private double latitude;
    private double longitude;
    private int earthquakeEventYear;

    /**
     * Constructs an Earthquake object constructor.
     * @param magnitude the earthquake magnitude, with type as double.
     * @param latitude the earthquake latitude, with type as double.
     * @param longitude the earthquake longitude, with type as double.
     * @param earthquakeEventYear the earthquake event year, with the type int.
     */
    public Earthquake(double magnitude, double latitude, double longitude, int earthquakeEventYear)
    {
        this.magnitude = magnitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.earthquakeEventYear = earthquakeEventYear;
    }

    /**
     * Gets the earthquake magnitude.
     * @return the magnitude as double
     */
    public double getMagnitude() {
        return magnitude;
    }

    /**
     * Set the earthquake magnitude.
     * @param magnitude the earthquake magnitude, with type as double
     */
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    /**
     * Gets the earthquake latitude.
     * @return the latitude as double
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Set the earthquake latitude.
     * @param latitude the earthquake latitude, with the type as double
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Get the earthquake longitude.
     * @return the longitude as double
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Set the earthquake longitude.
     * @param longitude the earthquake longitude, with the type as double
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Get the earthquake event year.
     * @return the earthquake event year as int
     */
    public int getEarthquakeEventYear() {
        return earthquakeEventYear;
    }

    /**
     * Set the earthquake event year.
     * @param earthquakeEventYear the earthquake even year, with the type as int
     */
    public void setEarthquakeEventYear(int earthquakeEventYear) {
        this.earthquakeEventYear = earthquakeEventYear;
    }
}

