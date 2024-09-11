import com.junit.testes.Conta;
import com.junit.testes.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validaCenarioDeExcecaoTransferencia(){
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("4312", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino, -10));
    }

    @Test
    void validaSeNaoPassouPelaExcecaoTransferencia(){
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("4312", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem,contaDestino, 20));
    }
}
