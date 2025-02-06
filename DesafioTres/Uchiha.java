package DesafioTres;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("A habilidade especial do seu ninja é: " + habilidadeEspecial);
    }

    public void mostrarInformacoesComEspecial(){
        System.out.println("O nome do ninja é: " + nome);
        System.out.println("A idade do ninja é: " + idade);
        System.out.println("A atual missão do ninja é:" + missao);
        System.out.println("A dificuldade dessa missao é : " + nivelDificuldade);
        System.out.println("O status dessa missão é: " + statusMissao);
        System.out.println("A habilidade especial do seu ninja é: " + habilidadeEspecial);
    }

}
