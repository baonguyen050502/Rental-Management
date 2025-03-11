package BusServiceSystem;

public class Complaint {
    private String complaintID;
    private Bus bus;
    private BusStop busStop;
    private String date;
    private String complaint;

    public Complaint(String complaintID, Bus bus, BusStop busStop, String date, String complaint) {
        this.complaintID = complaintID;
        this.bus = bus;
        this.busStop = busStop;
        this.date = date;
        this.complaint = complaint;
    }

    public void displayComplaints() {
        System.out.println("Complaint ID: " + complaintID);
        System.out.println("Bus Name: " + bus.getBusName());
        System.out.println("Bus Stop: " + busStop.getBusStopName());
        System.out.println("Date: " + date);
        System.out.println("Complaint: " + complaint);
    }
}
