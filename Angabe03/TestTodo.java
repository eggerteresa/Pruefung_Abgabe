package Angabe03;

public class TestTodo {
    public static void main(String[] args) {
        Task t1 = new Task(0, "Einkaufen",false);
        Task t2 = new Task (1, "PR1 Ueben", false);
        Task t3 = new Task (2, "Lernen", false);
        TodoListenVerwaltung tlv = new TodoListenVerwaltung();

        tlv.markTaskComplete(1);

      tlv.displayTasks();

      tlv.deleteTask(2);

        tlv.displayTasks();





    }
}
