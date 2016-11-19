import mx.iteso.States.IDLE;
import mx.iteso.TelephonicLine;
import static mx.iteso.TelephonicLine.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 17/11/2016.
 */
public class IDLETest {
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