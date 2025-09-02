import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task task = new Task();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {

            System.out.println("===Sistema de Tarefas===");

            System.out.println("1 - Cadastrar Tarefa ");
            System.out.println("2 - Mostrar Tarefas ");
            System.out.println("3 - Editar Tarefas ");
            System.out.println("4 - Remover Tarefas ");
            System.out.println("5 - Filtrar Tarefas ");
            System.out.println("6 - Sair ");

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
                    task.editarTask();
                    break;

                case 4:
                    task.removerTask();
                    break;

                case 5:
                    task.filtrarTask();
                    break;

                case 6:
                    System.out.println("Saindo...");

                default:
                    System.out.println("Opção invalida!");

            }

        }

    }

}