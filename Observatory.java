import java.util.ArrayList;

/**
 * A class which contains the observatory information.
 */
public class Observatory
{
    private String observatoryName;
    private String observatoryCountryName;
    private int observatoryStartedYear;
    private double observatoryCoverArea; // in square kilometres
    public ArrayList<Earthquake> earthquakeList;
    private double averageMagnitude;
    private ArrayList<Earthquake> earthquakesGreaterThanGivenNumber;

    /**
     * Construct an Observatory object constructor.
     * @param observatoryName the name of the observatory, with type String.
     * @param observatoryCountryName the observatory's country name, with type String.
     * @param observatoryStartedYear the observatory started year, with type int.
     * @param observatoryCoverArea the observatory covered area(in square kilometers), with type double.
     */
    public Observatory(String observatoryName, String observatoryCountryName, int observatoryStartedYear, double observatoryCoverArea)
    {
        this.observatoryName = observatoryName;
        this.observatoryCountryName = observatoryCountryName;
        this.observatoryStartedYear = observatoryStartedYear;
        this.observatoryCoverArea = observatoryCoverArea;
        earthquakeList = new ArrayList<>();
        earthquakesGreaterThanGivenNumber = new ArrayList<>();
    }

    /**
     * The method calculates the largest magnitude earthquake recorded by the observatory.
     * @return the largest magnitude earthquake, with the type double
     */
    public double getLargestMagnitude()
    {
        double largetsMagnitude = earthquakeList.get(0).getMagnitude();
        for (int i = 1; i < earthquakeList.size(); i++)
        {
            if (largetsMagnitude < earthquakeList.get(i).getMagnitude())
            {
                largetsMagnitude = earthquakeList.get(i).getMagnitude();
            }
        }
        return largetsMagnitude;
    }

    /**
     * The method calculates the average earthquake magnitude recorded at the observatory.
     * @return the average magnitude earthquake, with the type double
     */
    public double getAverageMagnitude()
    {
        double total = 0;
        for (int i = 0; i < earthquakeList.size(); i++)
        {
            double element = earthquakeList.get(i).getMagnitude();
            total = total + element;
        }

        if (earthquakeList.size() > 0)
        {
            averageMagnitude = total / earthquakeList.size();
        }
        else
            {
                return 0;
            }
        return averageMagnitude;
    }

    /**
     * The method finds the earthquake recorded at the observatory with a
     * magnitude greater than a given number.
     * @param givenNumber An earthquake magnitude, with double type
     * @return ArrayList of earthquake magnitude greater than the given number
     */
    public ArrayList<Earthquake> getEarthquakesGreaterThanGivenNumber(double givenNumber)
    {
        earthquakesGreaterThanGivenNumber.clear();
        for (Earthquake element : earthquakeList)
        {
            if (element.getMagnitude() > givenNumber)
            {
                earthquakesGreaterThanGivenNumber.add(element);
            }
        }
        return earthquakesGreaterThanGivenNumber;
    }

    /**
     * Get the observatory name.
     * @return the observatory name as type String
     */
    public String getObservatoryName()
    {
        return observatoryName;
    }

    /**
     * Set the observatory name.
     * @param observatoryName the observatory name, with the type String
     */
    public void setObservatoryName(String observatoryName)
    {
        this.observatoryName = observatoryName;
    }

    /**
     * Get the observatory's country name.
     * @return the observatory's country name as type String
     */
    public String getObservatoryCountryName()
    {
        return observatoryCountryName;
    }

    /**
     * Set the observatory's country name.
     * @param observatoryCountryName the observatory's country name, with the type String
     */
    public void setObservatoryCountryName(String observatoryCountryName)
    {
        this.observatoryCountryName = observatoryCountryName;
    }

    /**
     * Get the observatory started year.
     * @return the observatory started year as type int
     */
    public int getObservatoryStartedYear()
    {
        return observatoryStartedYear;
    }

    /**
     * Set the observatory started year.
     * @param observatoryStartedYear the observatory started year, with the type int
     */
    public void setObservatoryStartedYear(int observatoryStartedYear)
    {
        this.observatoryStartedYear = observatoryStartedYear;
    }

    /**
     * Get the observatory cover area.
     * @return the observatory cover area as type double
     */
    public double getObservatoryCoverArea()
    {
        return observatoryCoverArea;
    }

    /**
     * Set the observatory cover area.
     * @param observatoryCoverArea the observatory cover area, with the type double
     */
    public void setObservatoryCoverArea(double observatoryCoverArea)
    {
        this.observatoryCoverArea = observatoryCoverArea;
    }

}