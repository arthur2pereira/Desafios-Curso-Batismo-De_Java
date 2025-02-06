package DesafioUm;

public class DesafioUm {
    public static void main(String[] args) {
        /*Ninja 1*/
        String nomeUm = "Naruto Usumaki";
        int idadeUm = 15;
        String missaoUm = "Missão nùmero 1";
        char nivelUm = 'S';
        String statusUm = "Em andamento";

        if (idadeUm < 15 && (nivelUm == 'C' || nivelUm == 'D')) {
            statusUm = "Concluido";
        } else if (idadeUm < 15 && (nivelUm != 'C' || nivelUm != 'D')) {
            statusUm = "Não pode concluir por causa da idade";
        } else {
            statusUm = "Concluido";
        }

        System.out.println(nomeUm);
        System.out.println(idadeUm);
        System.out.println(missaoUm);
        System.out.println(nivelUm);
        System.out.println(statusUm);

        System.out.println(" ");

        /*Ninja 2*/
        String nomeDois = "Sakura";
        int idadeDois = 14;
        String missaoDois = "Missão nùmero 2";
        char nivelDois = 'A';
        String statusDois = "Em andamento";

        if (idadeDois < 15 && (nivelDois == 'C' || nivelDois == 'D')) {
            statusDois = "Concluido";
        } else if (idadeDois < 15 && (nivelDois != 'C' || nivelDois != 'D')) {
            statusDois = "Não pode concluir por causa da idade";
        } else {
            statusDois = "Concluido";
        }

        System.out.println(nomeDois);
        System.out.println(idadeDois);
        System.out.println(missaoDois);
        System.out.println(nivelDois);
        System.out.println(statusDois);

        System.out.println(" ");

        /*Ninja 3*/
        String nomeTres = "Sasuke ";
        int idadeTres = 12;
        String missaoTres = "Missão nùmero 3";
        char nivelTres= 'C';
        String statusTres = "Em andamento";

        if (idadeTres < 15 && (nivelTres == 'C' || nivelTres == 'D')) {
            statusTres = "Concluido";
        } else if (idadeTres < 15 && (nivelTres != 'C' || nivelTres!= 'D')) {
            statusTres = "Não pode concluir por causa da idade";
        } else {
            statusTres = "Concluido";
        }

        System.out.println(nomeTres);
        System.out.println(idadeTres);
        System.out.println(missaoTres);
        System.out.println(nivelTres);
        System.out.println(statusTres);
    }
}
