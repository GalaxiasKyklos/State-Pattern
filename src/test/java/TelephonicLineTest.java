import mx.iteso.State;
import mx.iteso.TelephonicLine;
import static mx.iteso.TelephonicLine.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.AdditionalAnswers;

import static org.mockito.Mockito.*;

/**
 * Created by Saúl on 19/11/2016.
 */
public class TelephonicLineTest {
    State state;
    TelephonicLine telephonicLine;
    @Before
    public void setUp() {
        telephonicLine =  new TelephonicLine();
        state = mock(State.class);
        when(state.goNext(any(TelephonicLine.class), anyInt())).thenReturn(AdditionalAnswers.returnsLastArg() + "");
        telephonicLine.setState(state);
    }

    @Test
    public void makeCallTest() {
        telephonicLine.makeCall();
        verify(state, times(1)).goNext(telephonicLine, AOff);
    }

    @Test
    public void receiveCallTest() {
        telephonicLine.receiveCall();
        verify(state, times(1)).goNext(telephonicLine, CallEntry);
    }

    @Test
    public void aOnHookTest() {
        telephonicLine.aOnHook();
        verify(state, times(1)).goNext(telephonicLine, AOnHook);
    }

    @Test
    public void bSideAcceptsCallTest() {
        telephonicLine.bSideAcceptsCall();
        verify(state, times(1)).goNext(telephonicLine, BSideAcceptsCall);
    }

    @Test
    public void dialledNomBusyOrIncorrectTest() {
        telephonicLine.dialledNomBusyOrIncorrect();
        verify(state, times(1)).goNext(telephonicLine, DialledNomBusyOrIncorrect);
    }

    @Test
    public void bSideAnswersTest() {
        telephonicLine.bSideAnswers();
        verify(state, times(1)).goNext(telephonicLine, BSideAnswers);
    }

    @Test
    public void ownSideGoesOnHookTest() {
        telephonicLine.ownSideGoesOnHook();
        verify(state, times(1)).goNext(telephonicLine, OwnSideGoesOnHook);
    }

    @Test
    public void otherSideGoesOnHook() {
        telephonicLine.otherSideGoesOnHook();
        verify(state, times(1)).goNext(telephonicLine, OtherSideGoesOnHook);
    }
}
