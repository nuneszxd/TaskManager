import java.util.Scanner;

public class Task {

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

     System.out.println("Cadastre uma tarefa: ");

     System.out.println("Digite o nome da tarefa: ");
     this.setName(sc.nextLine());

     System.out.println("Descrição: ");
     this.setDescricao(sc.nextLine());

 }

 public void mostrarTask(){

        if( getName().isEmpty() && getDescricao().isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
        }else {
            System.out.println("===Tarefa Atual===\n Tarefa - " + getName() + "\nDescrição: " + getDescricao());
        }
 }

}
