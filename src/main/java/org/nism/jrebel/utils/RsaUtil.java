package org.nism.jrebel.utils;

import org.nism.jrebel.core.C;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.RSAPrivateKeySpec;

/**
 * rsa util
 *
 * @author inism
 */
public class RsaUtil {

    private RsaUtil() {
        throw new IllegalStateException();
    }

    public static String sign(String content) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Signature signature = Signature.getInstance("MD5WithRSA");

            PrivateKey priKey = keyFactory.generatePrivate(new RSAPrivateKeySpec(C.MODULUS, C.PRIVATE_EXPONENT));
            signature.initSign(priKey);
            signature.update(content.getBytes());
            byte[] signed = signature.sign();
            return convert(signed);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String convert(byte[] src) {
        StringBuilder s = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte b : src) {
            int v = b & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                s.append(0);
            }
            s.append(hv);
        }
        return s.toString();
    }

}
