// Main.java
public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaInvestimento(500);
        Conta contaPoupanca = new ContaPoupanca(300);

        try {
            contaCorrente.sacar(600);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            contaPoupanca.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
