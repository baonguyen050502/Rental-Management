package BusServiceSystem;

public class Bus {
    private String busName;
    private int capacity;
    private String driverName;
    private Route route;

    public Bus(String busName, int capacity, String driverName) {
        this.busName = busName;
        this.capacity = capacity;
        this.driverName = driverName;
        this.route = null;
    }

    public void assignRoute(Route route) {
        this.route = route;
    }

    public void displayBusDetails() {
        System.out.println("Bus Name: " + busName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Driver Name: " + driverName);
        if (route != null) {
            System.out.println("Assigned Route: " + route.getRouteName());
        } else {
            System.out.println("This bus has not been assigned to any route.");
        }
        System.out.println("-----------------------");
    }

    public String getBusName() {
        return busName;
    }

    public Route getRoute() {
        return route;
    }
}
