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

    public Task buscarId(int id){

        for (Task t : tasks){
            if (t.getId() == id){
                return t;
            }
        }
    return null;
    }

    public void editarTask(){

        mostrarTask();

        System.out.println("Digite o ID da tarefa a editar: ");
        int idProcurado = sc.nextInt();
        sc.nextLine();

        Task t = buscarId(idProcurado);

        if (t == null) {
            System.out.println("Tarefa não encontrada! ");
            return;
        }

        System.out.println("Digite o novo nome da tarrefa: ");
        String newName = sc.nextLine();
        t.setName(newName);

        System.out.println("Digite a nova descrição: ");
        String newDescricao = sc.nextLine();
        t.setDescricao(newDescricao);

        System.out.println("Tarefa editada com sucesso! ");

    }

    public void removerTask(){

        mostrarTask();

        System.out.println("Digite o ID da tarefa a remover: ");
        int idProcurado = sc.nextInt();
        sc.nextLine();

        Task t = buscarId(idProcurado);

        if (t == null) {
            System.out.println("Tarefa não encontrada! ");
            return;
        }

        tasks.remove(t);
        System.out.println("Tarefa removida! ");


    }

    public void filtrarTask(){

        System.out.println("=== Filtrar Tarefas ===");
        System.out.println("Digite a palavra que deseja buscar: ");
        String buscarTask = sc.nextLine();

        if (tasks.isEmpty()){

            System.out.println("Nenhuma tarefa cadastrada!");

        } else {

            for (int i = 0; i < tasks.size(); i++) {
                Task t = tasks.get(i);

                if (t.getName().contains(buscarTask) || t.getDescricao().contains(buscarTask)) {
                    System.out.println("Tarefa - " + t.getId());
                    System.out.println("Nome: " + t.getName());
                    System.out.println("Descrição: " + t.getDescricao());

                    System.out.println("Selecione pelo ID da tarefa que deseja editar/remover: ");
                    int idProcurado = sc.nextInt();
                    sc.nextLine();

                    t = buscarId(idProcurado);

                    if (t == null) {
                        System.out.println("Tarefa não encontrada!");
                        return;
                    }


                    System.out.println("Você deseja editar ou remover a tarefa? (editar/remover)");
                    String escolhaTask = sc.nextLine();

                    if (escolhaTask.equalsIgnoreCase("editar")) {
                        System.out.println("Digite o novo nome da tarefa: ");
                        t.setName(sc.nextLine());

                        System.out.println("Digite a nova descrição: ");
                        t.setDescricao(sc.nextLine());

                        System.out.println("Tarefa editada com sucesso!");
                    } else if (escolhaTask.equalsIgnoreCase("remover")) {
                        tasks.remove(i);
                        i--;
                        System.out.println("Tarefa removida com sucesso!");
                    }

                }

            }
        }

    }

}
