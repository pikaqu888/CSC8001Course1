import java.util.ArrayList;

/**
 * A class which contains information about all observatories.
 */
public class Monitoring
{
    public ArrayList<Observatory> observatoryList;
    private int index;
    private ArrayList<Earthquake> earthquakesRecordGreaterGivenNumber;

    /**
     * Construct a Monitory object constructor.
     */
    public Monitoring()
    {
        observatoryList = new ArrayList<>();
        earthquakesRecordGreaterGivenNumber = new ArrayList<>();
    }

    /**
     * The method calculates the average earthquake magnitude of every observatory record in Monitoring, and then
     * choose the largest average earthquake magnitude.
     * @return The largest average earthquake, with type Observatory
     */
    public Observatory getLargestAverageObservatory()
    {
        double value = observatoryList.get(0).getAverageMagnitude();
        index = 0;
        for (int i = 1; i < observatoryList.size(); i++)
        {
            if (value < observatoryList.get(i).getAverageMagnitude())
            {
                value = observatoryList.get(i).getAverageMagnitude();
                index = i;
            }
        }
        return observatoryList.get(index);
    }

    /**
     * The method calculates the largest earthquake magnitude recorded in all the observatories.
     * @return the largest magnitude earthquake, with type Observatory
     */
    public Observatory getLargestMagnitudeRecord()
    {
        double largestRecord = observatoryList.get(0).getLargestMagnitude();
        index = 0;
        for (int i = 1; i < observatoryList.size(); i++)
        {
            if (largestRecord < observatoryList.get(i).getLargestMagnitude())
            {
                largestRecord = observatoryList.get(i).getLargestMagnitude();
                index = i;
            }
        }
        return observatoryList.get(index);
    }

    /**
     * The method finds the earthquake recorded at the observatory with a
     * magnitude greater than a given number.
     * @param givenNumber An earthquake magnitude, with double type
     * @return ArrayList of earthquake magnitude greater than the given number
     */
    public ArrayList<Earthquake> getAllGreaterThanGivenNumber(double givenNumber)
    {
        earthquakesRecordGreaterGivenNumber.clear();
        for (Observatory element : observatoryList)
        {
            earthquakesRecordGreaterGivenNumber.addAll(element.getEarthquakesGreaterThanGivenNumber(givenNumber));
        }
        if (earthquakesRecordGreaterGivenNumber.isEmpty())
        {
            System.out.println("There is no number greater than " + givenNumber);
        }
        return earthquakesRecordGreaterGivenNumber;
    }

}
