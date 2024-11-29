package org.nism.jrebel.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * random email
 *
 * @author inism
 */
public class EmailUtil {

    private static final char[] BASE_CHAR = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final int[] BASE_NUM = {6, 7, 8, 9, 10};
    private static final String[] BASE_DOMAIN = {"gmail.com", "yahoo.com", "msn.com", "hotmail.com", "outlook.com", "yeah.net", "126.com", "139.com", "189.com", "163.com", "sina.com", "sohu.com", "sogou.com", "qq.com", "aliyun.com",};
    private static Random random;

    static {
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private EmailUtil() {
        throw new IllegalStateException();
    }

    public static String random() {
        StringBuilder e = new StringBuilder();

        int l = BASE_NUM[random.nextInt(BASE_NUM.length)];

        for (int i = 0; i < l; i++) {
            e.append(BASE_CHAR[random.nextInt(BASE_CHAR.length)]);
        }

        e.append(random.nextInt(99));
        e.append("@");
        e.append(BASE_DOMAIN[random.nextInt(BASE_DOMAIN.length)]);

        return e.toString();
    }

}
