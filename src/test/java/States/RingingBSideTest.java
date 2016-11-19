package States;

import mx.iteso.States.IDLE;
import mx.iteso.States.RingingBSide;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 19/11/2016.
 */
public class RingingBSideTest {
    public TelephonicLine telephonicLine;
    public RingingBSide ringingBSide;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        ringingBSide = new RingingBSide();
    }

    @Test
    public void goNext0Test() {
        assertEquals(ringingBSide.goNext(telephonicLine, AOnHook), "Cambiando a IDLE");
    }

    @Test
    public void goNext1Test() {
        assertEquals(ringingBSide.goNext(telephonicLine, BSideAnswers), "Cambiando a Speech");
    }

    @Test
    public void goNextErrorTest() {
        assertEquals(ringingBSide.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
