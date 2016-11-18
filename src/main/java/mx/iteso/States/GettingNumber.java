package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class GettingNumber implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;

         if(context==telephonicLine.AOnHook){
            retorno = "Cambiando a Idle";
            System.out.println(retorno);
            telephonicLine.setState(new IDLE());
        }
        else if(context==telephonicLine.BSideAcceptsCall){
            retorno = "Cambiando a Ringing A side";
            System.out.println(retorno);
            telephonicLine.setState(new RingingASide());
        }
        else if(context==telephonicLine.DialledNomBusyOrIncorrect) {
            retorno = "Cambiando a Wait on hook";
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
