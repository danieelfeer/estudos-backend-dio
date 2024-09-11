import com.junit.testes.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestePessoa {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa daniel = new Pessoa("Daniel", LocalDate.of(2005,3,26));
        Assertions.assertEquals(19, daniel.getIdade());
    }

}
