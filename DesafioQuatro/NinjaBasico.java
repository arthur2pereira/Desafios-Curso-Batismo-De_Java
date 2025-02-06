package DesafioQuatro;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidadeEnum habilidade;


    public NinjaBasico(String nome, int idade, TipoHabilidadeEnum habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos,  minha habilidade especial é " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativei a habilidade " + habilidade);
    }
}
