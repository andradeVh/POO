package ads.poo;

public class Conta {
    private String titular;
    private double saldo;
    private String numero;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else if (valor > saldo) {
            IO.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public String toString() {
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """, numero, titular, saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}