package DesafioQuatro;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Sasuke = new NinjaBasico("Sasuke Uchiha", 14, TipoHabilidadeEnum.Ninjutsu);
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();

        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi Hatake", 26, TipoHabilidadeEnum.Katon, "Copiar mil jutsu");
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
    }
}

