package Angabe03;

public class TodoListenVerwaltung {
    private Task[] tasks;
   private int nextId;

// Methode, die einen neuen Task mit einem title als Uebergabeparameter in ein bereits bestehendes Array namens tasks hinzufuegt
   public void addTask(String title) {
    //    this.title = title;
       // tasks = new Task[title];

    }



   // Methode die ganze Zahl als Übergabeparameter hat und Task mit angegebener ID in dem bereits bestehendem Array tasks zurückgibt
    public void getTask(int id) {
       for (int i = 0; i < tasks.length; i++) {
         if (id == tasks[i].getId() ){
              tasks[i].setId(id);

           }
       }
    }

    //Methode die den Status des ausgewählten Tasks auf true setzt
    public void markTaskComplete (int id) {
       for (int i = 0; i< tasks.length; i++) {
           if (tasks[i].getId() == id) {
               tasks[i].setComplete(true);
           }
           if (tasks[i].getId() !=id) {
               tasks [i] = null;
           }
       }
    }

    //Methode die Task löscht
    public void deleteTask(int id) {
       for (int i =0; i < tasks.length; i++) {
           if(tasks[i].getId() == id) {
               tasks[i]=null;
               System.out.println("Task mit ID " + id +" wurde aus dem System entfernt.");
           }
       } // Kein Treffer:
        System.out.println(" Task mit ID " + id + " wurde nicht gefunden.");
    }

    //Gibt alle Tasks aus
    public void displayTasks() {
        System.out.println(" ID ------ Titel --- Status ");
        for (int i =0; i<tasks.length; i++) {
            if (tasks[i].isComplete() == true){
                System.out.println("Erledigt");}
            if (tasks[i].isComplete() == false) {
                System.out.println("offen");
            }
            System.out.println(tasks[i].getId()+ " --- " + tasks[i].getTitle() + "--- " + tasks[i].isComplete());
        }



    }



}





