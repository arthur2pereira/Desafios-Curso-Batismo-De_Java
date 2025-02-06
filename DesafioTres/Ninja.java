package DesafioTres;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é: " + nome);
        System.out.println("A idade do ninja é: " + idade);
        System.out.println("A atual missão do ninja é:" + missao);
        System.out.println("A dificuldade dessa missao é : " + nivelDificuldade);
        System.out.println("O status dessa missão é: " + statusMissao);
    }
}
