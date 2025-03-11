package BusServiceSystem;

import java.util.*;

public class Graph {
    private final Map<String, Map<String, Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addBusStop(String stop) {
        adjacencyList.putIfAbsent(stop, new HashMap<>());
    }

    public void addRoute(String stop1, String stop2, int distance) {
        adjacencyList.get(stop1).put(stop2, distance);
        adjacencyList.get(stop2).put(stop1, distance);
    }

    public List<String> findShortestPath(String start, String end) {
        if (!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)) {
            System.out.println("Invalid bus stop!");
            return Collections.emptyList();
        }

        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previousStops = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (String stop : adjacencyList.keySet())
            distances.put(stop, Integer.MAX_VALUE);
        distances.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (var entry : adjacencyList.get(current).entrySet()) {
                int newDist = distances.get(current) + entry.getValue();
                if (newDist < distances.get(entry.getKey())) {
                    distances.put(entry.getKey(), newDist);
                    previousStops.put(entry.getKey(), current);
                    queue.add(entry.getKey());
                }
            }
        }
        return reconstructPath(previousStops, start, end);
    }

    private List<String> reconstructPath(Map<String, String> previousStops, String start, String end) {
        List<String> path = new ArrayList<>();
        for (String step = end; step != null; step = previousStops.get(step))
            path.add(step);
        Collections.reverse(path);
        return path;
    }
}
