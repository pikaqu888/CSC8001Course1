import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 * The test class for Monitoring class.
 */
class MonitoringTest {

    @Test
    void getLargestAverageObservatory()
    {
        Monitoring monitoring = new Monitoring();

        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.4, 75.3, 45.6, 1957);
        Observatory observatory1 = new Observatory("Newcastle", "UK", 1951, 30.5);
        observatory1.earthquakeList.add(earthquake1);
        observatory1.earthquakeList.add(earthquake2);
        observatory1.earthquakeList.add(earthquake3);

        Earthquake earthquake4 = new Earthquake(3.4, -65.0, 34.6, 1921);
        Earthquake earthquake5 = new Earthquake(5.3, 65.7, 72.8, 1943);
        Earthquake earthquake6 = new Earthquake(7.2, 124.6, -75.3, 1898);
        Observatory observatory2 = new Observatory("London", "UK", 1896, 59.3);
        observatory2.earthquakeList.add(earthquake4);
        observatory2.earthquakeList.add(earthquake5);
        observatory2.earthquakeList.add(earthquake6);

        Earthquake earthquake7 = new Earthquake(5.6, 76.7, -34.6, 1911);
        Earthquake earthquake8 = new Earthquake(4.7, -67.4, 156.8, 1955);
        Earthquake earthquake9 = new Earthquake(8.3, 56.4, -111.1, 1949);
        Observatory observatory3 = new Observatory("Madrid", "Spain", 1910, 49.6);
        observatory3.earthquakeList.add(earthquake7);
        observatory3.earthquakeList.add(earthquake8);
        observatory3.earthquakeList.add(earthquake9);

        monitoring.observatoryList.add(observatory1);
        monitoring.observatoryList.add(observatory2);
        monitoring.observatoryList.add(observatory3);

        assertEquals(observatory1, monitoring.getLargestAverageObservatory());

    }

    @Test
    void getLargestMagnitudeRecord()
    {
        Monitoring monitoring = new Monitoring();

        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.4, 75.3, 45.6, 1957);
        Observatory observatory1 = new Observatory("Newcastle", "UK", 1951, 30.5);
        observatory1.earthquakeList.add(earthquake1);
        observatory1.earthquakeList.add(earthquake2);
        observatory1.earthquakeList.add(earthquake3);

        Earthquake earthquake4 = new Earthquake(3.4, -65.0, 34.6, 1921);
        Earthquake earthquake5 = new Earthquake(5.3, 65.7, 72.8, 1943);
        Earthquake earthquake6 = new Earthquake(7.2, 124.6, -75.3, 1898);
        Observatory observatory2 = new Observatory("London", "UK", 1896, 59.3);
        observatory2.earthquakeList.add(earthquake4);
        observatory2.earthquakeList.add(earthquake5);
        observatory2.earthquakeList.add(earthquake6);

        Earthquake earthquake7 = new Earthquake(5.6, 76.7, -34.6, 1911);
        Earthquake earthquake8 = new Earthquake(4.7, -67.4, 156.8, 1955);
        Earthquake earthquake9 = new Earthquake(8.3, 56.4, -111.1, 1949);
        Observatory observatory3 = new Observatory("Madrid", "Spain", 1910, 49.6);
        observatory3.earthquakeList.add(earthquake7);
        observatory3.earthquakeList.add(earthquake8);
        observatory3.earthquakeList.add(earthquake9);

        monitoring.observatoryList.add(observatory1);
        monitoring.observatoryList.add(observatory2);
        monitoring.observatoryList.add(observatory3);

        assertEquals(9.9, monitoring.getLargestMagnitudeRecord().getLargestMagnitude());

    }

    @Test
    void getAllGreaterThanGivenNumber()
    {
        Monitoring monitoring = new Monitoring();

        Earthquake earthquake1 = new Earthquake(8.6, 34.5, 55.3, 1981);
        Earthquake earthquake2 = new Earthquake(9.9, 54.2, 67.8, 1998);
        Earthquake earthquake3 = new Earthquake(6.4, 75.3, 45.6, 1957);
        Observatory observatory1 = new Observatory("Newcastle", "UK", 1951, 30.5);
        observatory1.earthquakeList.add(earthquake1);
        observatory1.earthquakeList.add(earthquake2);
        observatory1.earthquakeList.add(earthquake3);

        Earthquake earthquake4 = new Earthquake(3.4, -65.0, 34.6, 1921);
        Earthquake earthquake5 = new Earthquake(5.3, 65.7, 72.8, 1943);
        Earthquake earthquake6 = new Earthquake(7.2, 124.6, -75.3, 1898);
        Observatory observatory2 = new Observatory("London", "UK", 1896, 59.3);
        observatory2.earthquakeList.add(earthquake4);
        observatory2.earthquakeList.add(earthquake5);
        observatory2.earthquakeList.add(earthquake6);

        Earthquake earthquake7 = new Earthquake(5.6, 76.7, -34.6, 1911);
        Earthquake earthquake8 = new Earthquake(4.7, -67.4, 156.8, 1955);
        Earthquake earthquake9 = new Earthquake(8.3, 56.4, -111.1, 1949);
        Observatory observatory3 = new Observatory("Madrid", "Spain", 1910, 49.6);
        observatory3.earthquakeList.add(earthquake7);
        observatory3.earthquakeList.add(earthquake8);
        observatory3.earthquakeList.add(earthquake9);

        monitoring.observatoryList.add(observatory1);
        monitoring.observatoryList.add(observatory2);
        monitoring.observatoryList.add(observatory3);

        ArrayList<Earthquake> earthquakeListGreaterThanGivenNumber = monitoring.getAllGreaterThanGivenNumber(6.5);
        assertTrue(earthquakeListGreaterThanGivenNumber.contains(earthquake1));
        assertTrue(earthquakeListGreaterThanGivenNumber.contains(earthquake2));
        assertFalse(earthquakeListGreaterThanGivenNumber.contains(earthquake3));
        assertFalse(earthquakeListGreaterThanGivenNumber.contains(earthquake4));
        assertFalse(earthquakeListGreaterThanGivenNumber.contains(earthquake5));
        assertTrue(earthquakeListGreaterThanGivenNumber.contains(earthquake6));
        assertFalse(earthquakeListGreaterThanGivenNumber.contains(earthquake7));
        assertFalse(earthquakeListGreaterThanGivenNumber.contains(earthquake8));
        assertTrue(earthquakeListGreaterThanGivenNumber.contains(earthquake9));

    }
}