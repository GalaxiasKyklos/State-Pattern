package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class WaitOnHook implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;

        if(context==telephonicLine.OwnSideGoesOnHook){
            retorno = "Cambiando a Idle";
            System.out.println(retorno);
            telephonicLine.setState(new IDLE());
        }
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }

        return retorno;
    }
}
