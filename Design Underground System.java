import java.util.*;

class UndergroundSystem {

    HashMap<Integer, String> station = new HashMap<>();
    HashMap<Integer, Integer> time = new HashMap<>();

    HashMap<String, Double> total = new HashMap<>();
    HashMap<String, Integer> count = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName);
        time.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        String route = station.get(id) + "->" + stationName;
        double travelTime = t - time.get(id);

        total.put(route, total.getOrDefault(route, 0.0) + travelTime);
        count.put(route, count.getOrDefault(route, 0) + 1);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;

        return total.get(route) / count.get(route);
    }
}
