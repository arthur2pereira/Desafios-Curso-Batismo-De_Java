package DesafioCinco;

public class ContaPoupanca extends ContaBancaria{
     double porcentagem = 5;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("====== NA CONTA POUPANÇA ======");
        System.out.println("O saldo atual é:" + saldo);
    }

    @Override
    public double depositar(double valor) {
        saldo += (valor - (porcentagem / 100));
        return valor;
    }
}
