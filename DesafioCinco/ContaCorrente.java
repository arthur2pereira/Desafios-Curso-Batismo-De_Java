package DesafioCinco;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("====== NA CONTA CORENTE ======");
        System.out.println("O saldo atual é:" + saldo);
    }

    @Override
    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }
}
