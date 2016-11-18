package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 17/11/2016.
 */
public class IDLE implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;

        if(context == telephonicLine.AOff){
            retorno = "Cambiando a Getting Number";
            System.out.println(retorno);
            telephonicLine.setState(new GettingNumber());
        }
        else if(context == telephonicLine.CallEntry) {
            retorno = "Cambiando a Ringing B Side";
            System.out.println(retorno);
            telephonicLine.setState(new RingingBSide());
        }
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }
        return retorno;
    }
}
