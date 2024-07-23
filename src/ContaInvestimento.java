// ContaCorrente.java
public class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso na conta corrente.");
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta corrente.");
        }
    }
}