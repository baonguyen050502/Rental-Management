package BusServiceSystem;

public class Booking {
    private String bookingID;
    private Bus bus;
    private BusStop busStop;
    private BusStop destination;
    private String date;

    public Booking(String bookingID, Bus bus, BusStop busStop, BusStop destination, String date) {
        this.bookingID = bookingID;
        this.bus = bus;
        this.busStop = busStop;
        this.destination = destination;
        this.date = date;
    }

    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Bus Name: " + bus.getBusName());
        System.out.println("Start: " + busStop.getBusStopName());
        System.out.println("End: " + destination.getBusStopName());
        System.out.println("Date: " + date);
    }
}
