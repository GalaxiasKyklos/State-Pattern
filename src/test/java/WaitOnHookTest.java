import mx.iteso.States.IDLE;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.AOff;
import static mx.iteso.TelephonicLine.CallEntry;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 19/11/2016.
 */
public class WaitOnHookTest {
    public TelephonicLine telephonicLine;
    public IDLE idle;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        idle = new IDLE();
    }

    @Test
    public void goNext0Test() {
        assertEquals(idle.goNext(telephonicLine, AOff), "Cambiando a Getting Number");
    }

    @Test
    public void goNext1Test() {
        assertEquals(idle.goNext(telephonicLine, CallEntry), "Cambiando a Ringing B Side");
    }

    @Test
    public void goNextErrorTest() {
        assertEquals(idle.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
