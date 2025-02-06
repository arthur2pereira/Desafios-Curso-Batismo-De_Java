package DesafioTres;
public class Main {
    public static void main(String[] args) {

        /*Desafio normal concluido*/
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.missao = "Fazer escolta de um Hokage ferido";
        Sasuke.nivelDificuldade = "S";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Sharingan";

        Sasuke.mostrarInformacoes();
        System.out.println(" ");
        Sasuke.mostrarHabilidadeEspecial();
        System.out.println(" ");
        Sasuke.mostrarInformacoesComEspecial();
    }
}