import mx.iteso.States.GettingNumber;
import mx.iteso.States.IDLE;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 19/11/2016.
 */
public class GettingNumberTest {
    public TelephonicLine telephonicLine;
    public GettingNumber gettingNumber;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        gettingNumber = new GettingNumber();
    }

    @Test
    public void goNext0Test() {
        assertEquals(gettingNumber.goNext(telephonicLine, AOnHook), "Cambiando a Idle");
    }

    @Test
    public void goNext1Test() {
        assertEquals(gettingNumber.goNext(telephonicLine, BSideAcceptsCall), "Cambiando a Ringing A side");
    }
    @Test
    public void goNext2Test() {
        assertEquals(gettingNumber.goNext(telephonicLine, DialledNomBusyOrIncorrect), "Cambiando a Wait on hook");
    }

    @Test
    public void goNextErrorTest() {
        assertEquals(gettingNumber.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
