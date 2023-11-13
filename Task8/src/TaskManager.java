//Создать приложение для управления задачами проекта, которое позволяет сохранять и поддерживать состояние проектов, включая задачи и их статус.
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<String, String> tasks;

    public TaskManager() {
        tasks = new HashMap<>();
    }

    public void addTask(String task, String status) {
        tasks.put(task, status);
    }

    public void updateStatus(String task, String status) {
        if (tasks.containsKey(task)) {
            tasks.put(task, status);
        } else {
            System.out.println("Задача не найдена!");
        }
    }

    public void printTasks() {
        for (Map.Entry<String, String> entry : tasks.entrySet())
            System.out.println("Задача: " + entry.getKey() + "   Статус: " + entry.getValue());
    }
}