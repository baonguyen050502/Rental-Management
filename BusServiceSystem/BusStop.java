package BusServiceSystem;

public class BusStop {
    private String busStopName;
    private String busStopLocation;

    public BusStop(String busStopName, String busStopLocation) {
        this.busStopName = busStopName;
        this.busStopLocation = busStopLocation;
    }

    public void displayBusStopDetails() {
        System.out.println("Bus Stop Name: " + busStopName);
        System.out.println("Bus Stop Location: " + busStopLocation);
    }

    public String getBusStopName() {
        return busStopName;
    }

    public String getBusStopLocation() {
        return busStopLocation;
    }
}
