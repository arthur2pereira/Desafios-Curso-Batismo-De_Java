package DesafioCinco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente ClienteCorrente = new ContaCorrente(2000);
        ClienteCorrente.depositar(500);
        ClienteCorrente.consultarSaldo();

        ContaPoupanca ClientePoupanca= new ContaPoupanca(100);
        ClientePoupanca.depositar(600);
        ClientePoupanca.consultarSaldo();



    }
}
