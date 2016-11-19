import mx.iteso.States.RingingASide;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Saúl on 19/11/2016.
 */
public class RingingASideTest {
    public TelephonicLine telephonicLine;
    public RingingASide ringingASide;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        ringingASide = new RingingASide();
    }

    @Test
    public void goNext0Test() {
        assertEquals(ringingASide.goNext(telephonicLine, AOnHook), "Cambiando a Idle");
    }

    @Test
    public void goNext1Test() {
        assertEquals(ringingASide.goNext(telephonicLine, BSideAnswers), "Cambiando a Speech");
    }

    @Test
    public void goNextErrorTest() {
        assertEquals(ringingASide.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
