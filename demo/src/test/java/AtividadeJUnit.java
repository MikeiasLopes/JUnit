import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AtividadeJUnit {
    Atividade cal = new Atividade();

    @Test
    void testSoma() {
        assertEquals(5, cal.Soma(3, 2));
    }

    @Test
    void testSubtracao() {
        assertEquals(3, cal.Subtracao(5, 2));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, cal.Multiplicacao(3, 2));
    }

    @Test
    void testDivisao() {
       Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           cal.Divisao(10, 0);
       });
       assertEquals("Divisão por zero não é permitida", exception.getMessage());
    }
}
