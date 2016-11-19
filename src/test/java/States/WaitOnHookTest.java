package States;

import mx.iteso.States.IDLE;
import mx.iteso.States.WaitOnHook;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.AOff;
import static mx.iteso.TelephonicLine.CallEntry;
import static mx.iteso.TelephonicLine.OwnSideGoesOnHook;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 19/11/2016.
 */
public class WaitOnHookTest {
    public TelephonicLine telephonicLine;
    public WaitOnHook waitOnHook;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        waitOnHook = new WaitOnHook();
    }

    @Test
    public void goNext0Test() {
        assertEquals(waitOnHook.goNext(telephonicLine, OwnSideGoesOnHook), "Cambiando a Idle");
    }


    @Test
    public void goNextErrorTest() {
        assertEquals(waitOnHook.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
