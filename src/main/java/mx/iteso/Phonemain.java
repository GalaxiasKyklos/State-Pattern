package mx.iteso;

/**
 * Created by Rodolfo on 18/11/2016.
 */
public class Phonemain {
    public static void main(String[] args){
        TelephonicLine telephonicLine=new TelephonicLine();
        telephonicLine.makeCall();
        telephonicLine.bSideAcceptsCall();
        telephonicLine.bSideAnswers();
        telephonicLine.ownSideGoesOnHook();
    }

}
