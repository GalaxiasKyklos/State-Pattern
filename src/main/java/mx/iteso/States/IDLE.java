package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 17/11/2016.
 */
public class IDLE implements State {
    public String goNext(TelephonicLine telephonicLine, TelephonicLine.contexts context) {
        switch (context) {
            case TelephonicLine.contexts.AOff:
                break;
            case "Call entry":
                break;
        }

        return "";
    }
}
