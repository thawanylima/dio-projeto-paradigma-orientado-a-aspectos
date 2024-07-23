// ContaPoupanca.java
public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso na conta poupança.");
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta poupança.");
        }
    }
}