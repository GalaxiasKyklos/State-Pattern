package States;

import mx.iteso.States.Speech;
import mx.iteso.TelephonicLine;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.TelephonicLine.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Saúl on 19/11/2016.
 */
public class SpeechTest {
    public TelephonicLine telephonicLine;
    public Speech speech;

    @Before
    public void setUp() {
        telephonicLine = new TelephonicLine();
        speech = new Speech();
    }

    @Test
    public void goNext0Test() {
        assertEquals(speech.goNext(telephonicLine, OwnSideGoesOnHook), "Cambiando a IDLE");
    }

    @Test
    public void goNext1Test() {
        assertEquals(speech.goNext(telephonicLine, OtherSideGoesOnHook), "Cambiando a Wait on Hook");
    }

    @Test
    public void goNextErrorTest() {
        assertEquals(speech.goNext(telephonicLine, -1), "Contexto inválido");
    }
}
