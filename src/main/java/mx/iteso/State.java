package mx.iteso;

/**
 * Created by Saúl on 17/11/2016.
 */
public interface State {
    String goNext(TelephonicLine telephonicLine, String context);
}
