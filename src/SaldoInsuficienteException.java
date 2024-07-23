// SaldoInsuficienteException.java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

// SaldoAspect.aj
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class SaldoAspect {
    @Before("execution(void Conta.sacar(double)) && args(valor)")
    public void verificarSaldo(double valor) throws Throwable {
        System.out.println("Verificando saldo para saque de: " + valor);
    }

    @AfterThrowing(pointcut = "execution(void Conta.sacar(double))", throwing = "ex")
    public void logSaldoInsuficiente(SaldoInsuficienteException ex) {
        System.err.println("Erro: " + ex.getMessage());
    }
}
