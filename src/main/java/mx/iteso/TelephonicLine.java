package mx.iteso;

/**
 * Created by Saúl on 17/11/2016.
 */
public class TelephonicLine {
    private State currentState;


    public static int AOff=0;
    public static int CallEntry=1;
    public static int AOnHook=2;
    public static int BSideAcceptsCall=3;
    public static int DialledNomBusyOrIncorrect=4;
    public static int BSideAnswers=5;
    public static int OwnSideGoesOnHook=6;
    public static int OtherSideGoesOnHook=7;


    public TelephonicLine() {

    }

    public void setState(State state) {
        this.currentState = state;
    }
}
