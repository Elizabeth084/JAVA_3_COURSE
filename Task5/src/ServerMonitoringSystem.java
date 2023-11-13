public class ServerMonitoringSystem {
    public static void main(String[] args) {
        Server server1 = new Server("Сервер1");
        Server server2 = new Server("Сервер2");

        ServerListener admin1 = message -> System.out.println("Админ1 получил: " + message);
        ServerListener admin2 = message -> System.out.println("Админ2 получил: " + message);

        server1.addListener(admin1);
        server2.addListener(admin2);

        server1.setDown(true);
        server2.setOverloaded(true);
    }
}
