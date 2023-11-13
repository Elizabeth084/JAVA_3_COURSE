import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Обновить статус задачи");
            System.out.println("3. печать задач");
            System.out.println("4. Выход");
            System.out.print("Введите свой выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine();
                    System.out.print("Введите статус задачи: ");
                    String status = scanner.nextLine();
                    taskManager.addTask(task, status);
                    break;
                case 2:
                    System.out.print("Введите название задачи: ");
                    task = scanner.nextLine();
                    System.out.print("Введите новый статус задачи: ");
                    status = scanner.nextLine();
                    taskManager.updateStatus(task, status);
                    break;
                case 3:
                    taskManager.printTasks();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }
}
