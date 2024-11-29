package org.nism.jrebel.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * main util
 *
 * @author inism
 */
public class MainUtil {

    private MainUtil() {
        throw new IllegalStateException();
    }

    public static Map<String, String> parseArguments(String[] args) {
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException("Error in argument's length ");
        }

        Map<String, String> params = new HashMap<>();

        for (int i = 0, len = args.length; i < len; ) {
            String argName = args[i++];

            if (argName.charAt(0) == '-') {
                if (argName.length() < 2) {
                    throw new IllegalArgumentException("Error at argument " + argName);
                }
                argName = argName.substring(1);
            }
            params.put(argName, args[i++]);
        }
        return params;
    }
}
