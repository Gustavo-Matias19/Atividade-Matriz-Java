import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Agente> agentes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Criar Empresário");
            System.out.println("2. Criar Professor");
            System.out.println("3. Criar Advogado");
            System.out.println("4. Apresentar Todos");
            System.out.println("5. Ativar Modo Agente");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeEmpresario = scanner.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = scanner.nextLine();
                    System.out.print("Modo Agente: ");
                    boolean modoagenteEmpresario = scanner.nextBoolean();
                    agentes.add(new Empresario(empresa, nomeEmpresario, "Empresário",
                            modoagenteEmpresario));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Escola: ");
                    String escola = scanner.nextLine();
                    System.out.print("Modo Agente: ");
                    boolean modoagenteProfessor = scanner.nextBoolean();                    
                    agentes.add(new Professor(escola, nomeProfessor, "Professor",
                            modoagenteProfessor ));
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeAdvogado = scanner.nextLine();
                    System.out.print("OAB: ");
                    String OAB = scanner.nextLine();
                    System.out.print("Modo Agente: ");
                    boolean modoagenteAdvogado = scanner.nextBoolean();
                    agentes.add(new Advogado(OAB, nomeAdvogado, "Advogado", 
                            modoagenteAdvogado ));
                    break;

                case 4:
                    for (Agente agente : agentes) {
                        agente.apresentacao();
                    }
                    break;

                case 5:
                    System.out.print("Indice da pessoa para ativar modo agente: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < agentes.size()) {
                        agentes.get(indice).modo_agente_on();
                        System.out.println("Modo agente ativado!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;


                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}