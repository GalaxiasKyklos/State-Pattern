package mx.iteso.States;

import mx.iteso.State;
import mx.iteso.TelephonicLine;

/**
 * Created by Saúl on 18/11/2016.
 */
public class RingingASide implements State {
    public String goNext(TelephonicLine telephonicLine, int context) {
        String retorno;

        if(context==telephonicLine.AOnHook) {
            retorno = "Cambiando a Idle";
            System.out.println(retorno);
            telephonicLine.setState(new IDLE());
        }
        else if(context==telephonicLine.BSideAnswers){
            retorno = "Cambiando a Speech";
            System.out.println(retorno);
            telephonicLine.setState(new Speech());
        }
        else {
            retorno = "Contexto inválido";
            System.out.println(retorno);
        }

        return retorno;
    }
}
