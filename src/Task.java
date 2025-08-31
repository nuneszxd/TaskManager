import java.util.Scanner;
import java.util.ArrayList;

public class Task {

    private static int contador = 1;
    ArrayList<Task> tasks = new ArrayList<>();

    private int id;
    private String name = "";
    private String descricao = "";

    Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

 public void cadastrarTask(){

      Task newTask = new Task();
      newTask.setId(contador++);

     System.out.println("Cadastre uma tarefa: ");

     System.out.println("Digite o nome da tarefa: ");
     newTask.setName(sc.nextLine());


     System.out.println("Descrição: ");
     newTask.setDescricao(sc.nextLine());

     tasks.add(newTask);

 }

 public void mostrarTask(){

        if(tasks.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
        }else {
            for (Task t : tasks) {
                System.out.println("=== Tarefa " + t.getId() + " ===");
                System.out.println("Nome: " + t.getName());
                System.out.println("Descrição: " + t.getDescricao());
                System.out.println();
            }
        }
 }

}
