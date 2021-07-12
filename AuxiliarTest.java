// Direitos Autorais, PUCRS/Escola Politécnica
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest.
 *
 * @author Marco Mangan 
 * @version 1.0
 */
public class AuxiliarTest
{
    /**
     * Construtor default para a classe de teste AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testInit()
    {
        assertNotSame(null, Auxiliar.init());
    }

    @Test
    public void testFim()
    {
        String[][] board = Auxiliar.init();
        assertEquals(false, Auxiliar.fimDeJogo(board));
    }
}


