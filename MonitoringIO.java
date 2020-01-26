import java.util.Scanner;

/**
 * A class with the main method that controls the whole project
 */
public class MonitoringIO
{
    public static void main(String[] args)
    {
        Monitoring monitor = new Monitoring();

        while(true) //loop until the user makes the choice to exit
        {

            System.out.println("Press 1 to enter observatory data;");
            System.out.println("Press 2 to enter earthquake data;");
            System.out.println("Press 3 to provide monitoring statistics data of earthquake;");
            System.out.println("Press 4 to exit;");
            System.out.println("Please enter you choice:");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch(choice) //use a switch statement for menu
            {
                case 1:
                    System.out.println("Please enter observatory name:");
                    String inputObservatoryName = in.next();

                    System.out.println("Please enter observatory's country name:");
                    String inputObservatoryCountryName = in.next();

                    System.out.println("Please enter earthquake observation started day:");
                    int inputObservatoryStartYear = in.nextInt();

                    System.out.println("Please enter observatory cover area(in square kilometres):");
                    double inputObservatoryCoverArea = in.nextDouble();

                    Observatory observatories = new Observatory(inputObservatoryName, inputObservatoryCountryName, inputObservatoryStartYear, inputObservatoryCoverArea);
                    monitor.observatoryList.add(observatories);
                    break;

                case 2:
                    try
                    {
                        System.out.println("Please enter earthquake magnitude(0 to 10):");
                        double inputMagnitude = -1;
                        while(inputMagnitude < 0 || inputMagnitude > 10)
                        {
                            inputMagnitude = in.nextDouble();
                            if (inputMagnitude < 0 || inputMagnitude > 10)
                            {
                                System.out.println("Invalid input, try it again: ");
                            }
                        }

                        System.out.println("Please enter earthquake latitude(-90 to 90):");
                        double inputLatitude = 100;
                        while (inputLatitude < -90 || inputLatitude > 90)
                        {
                            inputLatitude = in.nextDouble();
                            if (inputLatitude < -90 || inputLatitude > 90)
                            {
                                System.out.println("Invalid input, try it again: ");
                            }
                        }

                        System.out.println("Please enter earthquake longitude(-180 to 180):");
                        double inputLongitude = 200;
                        while (inputLongitude < -180 || inputLongitude > 180)
                        {
                            inputLongitude = in.nextDouble();
                            if (inputLongitude < -180 || inputLongitude > 180)
                            {
                                System.out.println("Invalid input, try it again: ");
                            }
                        }

                        System.out.println("Please enter earthquake event year:");
                        int inputEarthquakeEventYear = in.nextInt();

                        Earthquake earthquakes = new Earthquake(inputMagnitude, inputLatitude, inputLongitude, inputEarthquakeEventYear);
                        for (int i = 0; i < monitor.observatoryList.size(); i++)
                        {
                            System.out.println("Choice which observatory to add the earthquake data(by number beginning from 0): " +
                                    monitor.observatoryList.get(i).getObservatoryName() + " (" + i + ")");
                        }

                        int inputDataToObservatory = in.nextInt();
                        monitor.observatoryList.get(inputDataToObservatory).earthquakeList.add(earthquakes);
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("You don't have any Observatory, please create one first!");
                        break;
                    }

                case 3:
                    try
                    {
                        System.out.println();
                        Observatory observatoryLargestEarthquake = monitor.getLargestAverageObservatory();
                        System.out.println("Observatory information with the largest average earthquake: Observatory name: " + observatoryLargestEarthquake.getObservatoryName() +
                                ", Observatory Average Earthquake: " + observatoryLargestEarthquake.getAverageMagnitude());
                        Observatory largestEarthquake = monitor.getLargestMagnitudeRecord();
                        System.out.println("Largest magnitude earthquake record is: " + largestEarthquake.getLargestMagnitude() + ", which came from the observatory: " +
                                largestEarthquake.getObservatoryName()+ " in the country of: " + largestEarthquake.getObservatoryCountryName() + ", started on: " + largestEarthquake.getObservatoryStartedYear() +
                                " , the cover area is: " + largestEarthquake.getObservatoryCoverArea() + " square kilometres");
                        System.out.println("Please enter a number, which choose the magnitude greater than that number:");
                        double inputGivenNumber = in.nextDouble();
                        System.out.println("The earthquake magnitude greater than " + inputGivenNumber + " is/are ");
                        for(Earthquake num : monitor.getAllGreaterThanGivenNumber(inputGivenNumber))
                        {
                            System.out.println("The magnitude information: Earthquake Magnitude" + num.getMagnitude() + " the Latitude and Longitude are: " + num.getLatitude() + ", " + num.getLongitude() +
                                    " and the earthquake event year is: " + num.getEarthquakeEventYear());
                        }
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("You don't have any Observatory, please create one first!");
                        break;
                    }

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid number, please try again: ");
            }

        }

    }
}