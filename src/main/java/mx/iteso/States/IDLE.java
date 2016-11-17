package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 17/11/2016.
 */
public class IDLE implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        switch (context) {
            case TelephonicLine.contexts.AOff.ordinal():
                break;
            case "Call entry":
                break;
        }

        return "";
    }
}
