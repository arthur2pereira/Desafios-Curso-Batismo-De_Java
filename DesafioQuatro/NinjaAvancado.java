package DesafioQuatro;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    TipoHabilidadeEnum habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidadeEnum habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos, minha habilidade especial é " + habilidade + " e como eu sou um ninja avançado tenho uma especialidade chamada " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ativei a habilidade " + habilidade);
    }
}
