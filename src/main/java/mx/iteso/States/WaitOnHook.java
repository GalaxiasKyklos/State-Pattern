package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class WaitOnHook implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;
        if(context==telephonicLine.AOff){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
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
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }

        return retorno;
    }
}
