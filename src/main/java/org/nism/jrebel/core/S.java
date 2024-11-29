package org.nism.jrebel.core;


import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * @author inism
 */
public class S {

    private S() {
        throw new IllegalStateException();
    }

    public static String getSignature(String clientRandomness, String guid, boolean offline, long validFrom, long validUntil) {
        //服务端随机数,如果要自己生成，务必将其写到json的serverRandomness中
        List<String> sList = new ArrayList<>();
        sList.add(clientRandomness);
        sList.add(C.SERVER_RANDOMNESS);
        sList.add(guid);
        sList.add(String.valueOf(offline));
        if (offline) {
            sList.add(String.valueOf(validFrom));
            sList.add(String.valueOf(validUntil));
        }
        StringBuilder s = new StringBuilder();
        for (String s1 : sList) {
            s.append(s1).append(';');
        }
        s.deleteCharAt(s.length() - 1);
        final byte[] a = G.getKey(s.toString().getBytes());
        return convert(a);
    }

    private static String convert(final byte[] b) {
        return b == null ? null : new String(Base64.getEncoder().encode(b), C.UTF8);
    }

}
