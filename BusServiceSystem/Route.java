package BusServiceSystem;

import java.util.HashSet;
import java.util.Set;

public class Route {
    private String routeNumber;
    private String routeName;
    private BusStop routeStart;
    private BusStop routeEnd;
    private Set<BusStop> busStops;
    private Set<Bus> buses;

    public Route(String routeNumber, String routeName, BusStop routeStart, BusStop routeEnd) {
        this.routeNumber = routeNumber;
        this.routeName = routeName;
        this.routeStart = routeStart;
        this.routeEnd = routeEnd;
        this.busStops = new HashSet<>();
        this.buses = new HashSet<>();
    }

    public void addBusStop(BusStop busStop) {
        busStops.add(busStop);
    }

    public void assignBus(Bus bus) {
        if (buses.add(bus)) {
            bus.assignRoute(this);
        }
    }

    public void displayRouteDetails() {
        System.out.println("Route Number: " + routeNumber);
        System.out.println("Route Name: " + routeName);
        System.out.println("Start: " + routeStart.getBusStopName());
        System.out.println("End: " + routeEnd.getBusStopName());
        System.out.println("Bus Stops:");
        for (BusStop stop : busStops) {
            stop.displayBusStopDetails();
        }
    }

    public String getRouteName() {
        return routeName;
    }
}
