package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class GettingNumber implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;
        if(context==telephonicLine.AOff){

        }
        else if(context==telephonicLine.CallEntry){

        }
        else if(context==telephonicLine.AOnHook){
            retorno = "Cambiando a Idle";
            System.out.println(retorno);
            telephonicLine.setState(new IDLE());
        }
        else if(context==telephonicLine.BSideAcceptsCall){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else if(context==telephonicLine.DialledNomBusyOrIncorrect){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else if(context==telephonicLine.BSideAnswers){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else if(context==telephonicLine.OwnSideGoesOnHook){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else if(context==telephonicLine.OtherSideGoesOnHook){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }

        return retorno;
    }
}
