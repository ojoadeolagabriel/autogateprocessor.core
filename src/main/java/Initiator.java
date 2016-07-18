import services.SecurityUtil;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by AdeolaOjo on 7/16/2016.
 */
public class Initiator {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            String msg = SecurityUtil.getMD5("password");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
