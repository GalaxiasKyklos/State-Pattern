package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 17/11/2016.
 */
public class IDLE implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        if(context==telephonicLine.AOff){

        }
        else if(context==telephonicLine.CallEntry){

        }
        else if(context==telephonicLine.AOnHook){

        }
        else if(context==telephonicLine.BSideAcceptsCall){

        }
        else if(context==telephonicLine.DialledNomBusyOrIncorrect){

        }
        else if(context==telephonicLine.BSideAnswers){

        }
        else if(context==telephonicLine.OwnSideGoesOnHook){

        }
        else if(context==telephonicLine.OtherSideGoesOnHook){

        }

        return "";
    }
}
