package DesafioDois;
import java.util.Scanner;
public class DesafioDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMaximo = 10;
        String[] pessoas = new String[numeroMaximo];

        int pessoasCadastradas = 0;
        int opcao = 0;

        while (opcao != 4){

            /*Menu*/
            System.out.println("\n===== Menu Cadastro =====");
            System.out.println("1. Cadastrar uma pessoa ");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Deletar pessoas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (pessoasCadastradas < numeroMaximo) {
                        System.out.println("Insira o nome do Ninja que você quer cadastrar: ");
                        String nomePessoa = scanner.nextLine();
                        pessoas[pessoasCadastradas] = nomePessoa;
                        System.out.println("Seu ninja já foi cadastrado");
                    } else {
                        System.out.println("O numero de array está cheio");
                    }
                    pessoasCadastradas++;
                    break;
                case 2:

                    if (pessoasCadastradas != 0) {
                        System.out.println("Você entrou na sua lista de Pessoas: ");
                        for (int i = 0; i < pessoas.length; i++) {
                            System.out.println(pessoas[i]);
                        }
                    } else {
                        System.out.println("Não tem nenhum pessoa cadastrada");
                    }
                    break;
                case 3:
                    System.out.println("Você tem certeza q deseja apagar os cadastros??");
                    System.out.println("1. Deletar todas as pessoas ");
                    System.out.println("2. Manter como está");
                    System.out.print("Escolha uma opção: ");

                    int confimacao = scanner.nextInt();

                    if (confimacao == 1) {
                        pessoas = new String[numeroMaximo];
                        pessoas[pessoasCadastradas] = null;
                        System.out.println("Você deletou todos as pessoas.");
                        System.out.println("Sua lista atualizada: ");
                        for (int i = 0; i < pessoas.length; i++) {
                            System.out.println(pessoas[i]);
                        }
                    } else {
                        System.out.println("você não deletou ninguem");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("A opção q vc escolheu não existe.");
                    break;
            }
        }
    }
}
