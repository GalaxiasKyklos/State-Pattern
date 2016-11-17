package mx.iteso;

/**
 * Created by Saúl on 17/11/2016.
 */
public class TelephonicLine {
    private State currentState;

    public enum contexts {
        AOff,
        CallEntry,
        AOnHook,
        BSideAcceptsCall,
        DialledNomBusyOrIncorrect,
        BSideAnswers,
        OwnSideGoesOnHook,
        OtherSideGoesOnHook
    }

    public TelephonicLine() {

    }

    public void setState(State state) {
        this.currentState = state;
    }
}
