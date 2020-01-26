import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class for Observatory class.
 */
class ObservatoryTest {
    private String observatoryNameTest = "Newcastle";
    private String observatoryCountryNameTest = "UK";
    private int observatoryStartedYearTest = 1891;
    private double observatoryCoverAreaTest = 30.5;

    public Observatory createObservatory()
    {
        return new Observatory(observatoryNameTest, observatoryCountryNameTest, observatoryStartedYearTest, observatoryCoverAreaTest);
    }

    @Test
    void getLargestMagnitude()
    {
        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.2, 75.3, 45.6, 1957);

        Observatory observatory = createObservatory();

        observatory.earthquakeList.add(earthquake1);
        observatory.earthquakeList.add(earthquake2);
        observatory.earthquakeList.add(earthquake3);

        assertEquals(9.9, observatory.getLargestMagnitude());
    }

    @Test
    void getAverageMagnitude()
    {
        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.2, 75.3, 45.6, 1957);

        Observatory observatory = createObservatory();

        observatory.earthquakeList.add(earthquake1);
        observatory.earthquakeList.add(earthquake2);
        observatory.earthquakeList.add(earthquake3);

        double averageMagnitude = (8.6 + 9.9 + 6.2) / 3;

        assertEquals(averageMagnitude, observatory.getAverageMagnitude());
    }

    @Test
    void getEarthquakesGreaterThanGivenNumber()
    {
        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.2, 75.3, 45.6, 1957);

        Observatory observatory = createObservatory();

        observatory.earthquakeList.add(earthquake1);
        observatory.earthquakeList.add(earthquake2);
        observatory.earthquakeList.add(earthquake3);

        ArrayList<Earthquake> earthquakesGreaterThanGivenNum = observatory.getEarthquakesGreaterThanGivenNumber(6.5);

        assertTrue(earthquakesGreaterThanGivenNum.contains(earthquake1));
        assertTrue(earthquakesGreaterThanGivenNum.contains(earthquake2));
        assertFalse(earthquakesGreaterThanGivenNum.contains(earthquake3));
    }

    @Test
    void getObservatoryName()
    {
        Observatory observatory = createObservatory();
        assertEquals(observatoryNameTest, observatory.getObservatoryName());
    }

    @Test
    void getObservatoryCountryName()
    {
        Observatory observatory = createObservatory();
        assertEquals(observatoryCountryNameTest, observatory.getObservatoryCountryName());
    }

    @Test
    void getObservatoryStartedYear()
    {
        Observatory observatory = createObservatory();
        assertEquals(observatoryStartedYearTest, observatory.getObservatoryStartedYear());
    }

    @Test
    void getObservatoryCoverArea()
    {
        Observatory observatory = createObservatory();
        assertEquals(observatoryCoverAreaTest, observatory.getObservatoryCoverArea());
    }
}