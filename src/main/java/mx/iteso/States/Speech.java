package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class Speech implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;
        if(context==telephonicLine.OwnSideGoesOnHook){
            retorno = "Cambiando a IDLE";
            System.out.println(retorno);
            telephonicLine.setState(new IDLE());
        }
        else if(context==telephonicLine.OtherSideGoesOnHook){
            retorno = "Cambiando a Wait on Hook";
            System.out.println(retorno);
            telephonicLine.setState(new WaitOnHook());
        }
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }

        return retorno;
    }
}
