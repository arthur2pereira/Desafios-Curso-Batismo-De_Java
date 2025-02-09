package DesafioCinco;

public abstract class ContaBancaria implements ContaInterface{
    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public abstract void consultarSaldo();
    public abstract double depositar(double valor);
}
