package com.logisticRouterTracker;

public class Driver {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public RouteLinkedList<Checkpoint> getRouteHistory() {
        return routeHistory;
    }

    public double getRouteScore() {
        return routeHistory.computeTotalDistance() - routeHistory.computeTotalPenalty();
    }
}
