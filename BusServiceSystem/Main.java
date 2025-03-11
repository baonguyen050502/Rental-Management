package BusServiceSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Thêm điểm dừng xe buýt
        graph.addBusStop("Main Gate");
        graph.addBusStop("Library");
        graph.addBusStop("City Mall");
        graph.addBusStop("Airport Terminal");

        // Thêm khoảng cách giữa các điểm dừng
        graph.addRoute("Main Gate", "Library", 2);
        graph.addRoute("Library", "City Mall", 3);
        graph.addRoute("City Mall", "Airport Terminal", 5);
        graph.addRoute("Library", "Airport Terminal", 7);
        graph.addRoute("Main Gate", "Airport Terminal", 10);

        // Nhập từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm bắt đầu: ");
        String start = scanner.nextLine();
        System.out.print("Nhập điểm đến: ");
        String end = scanner.nextLine();
        scanner.close();

        // Tìm đường đi ngắn nhất
        List<String> shortestPath = graph.findShortestPath(start, end);

        if (shortestPath.size() == 1) {
            System.out.println("Không tìm thấy đường đi hợp lệ!");
        } else {
            System.out.println("Đường đi ngắn nhất: " + String.join(" ➝ ", shortestPath));
        }
    }
}
