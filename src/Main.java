import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Task task = new Task();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {



            System.out.println("===Sistema de Tarefas===");

            System.out.println("1 - Cadastrar Tarefa ");
            System.out.println("2 - Mostrar Tarefas ");
            System.out.println("3 - Sair ");


            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {

                case 1:
                    task.cadastrarTask();
                    break;

                case 2:
                    task.mostrarTask();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida!");

            }

        }

    }

}