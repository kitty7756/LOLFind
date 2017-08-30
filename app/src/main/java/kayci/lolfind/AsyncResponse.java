package kayci.lolfind;

/**
 * Created by lenovo on 2017/8/29.
 */

public interface AsyncResponse {
    void whenFinish();
    void whenBroken();
    void whenNoInternet();
}
