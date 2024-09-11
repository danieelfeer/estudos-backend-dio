import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "daniel")
    void validarAlgoSomenteNoUsuairioDaniel(){
        Assertions.assertEquals(10,5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)// Habilita apenas no OS Linux
    void validarSistemaOperacional(){
        Assertions.assertEquals(10,5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validarJre(){
        Assertions.assertEquals(10,5 + 5);
    }
}
