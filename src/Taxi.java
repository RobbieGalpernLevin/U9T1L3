public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License Plate" + getLicensePlate() + "\nToll Fee: " +getTollFee() + "\nPassengers " + getPassengers() +"\nElectric " + isElectric() + "\nDiscount Applied " + isDiscountApplied() + "\nFare Collected" + fareCollected);
    }

}
