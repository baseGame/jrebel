package org.nism.jrebel.utils;

import java.lang.reflect.Method;

/**
 * browse util
 *
 * @author inism
 */
public class BrowseUtil {

    public static final String[] BROWSERS = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};

    private BrowseUtil() {
        throw new IllegalStateException();
    }

    public static void open(String url) throws Exception {
        String osName = System.getProperty("os.name", "");
        if (osName.startsWith("Windows")) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else if (osName.startsWith("Mac OS")) {
            Method method = Class.forName("com.apple.eio.FileManager").getDeclaredMethod("openURL", String.class);
            method.invoke(null, url);
        } else {
            String browser = null;
            for (String b : BROWSERS) {
                if (Runtime.getRuntime().exec(new String[]{"which", b}).waitFor() == 0) {
                    browser = b;
                    break;
                }
            }
            if (browser == null) {
                throw new Exception("Could not find web browser");
            } else {
                Runtime.getRuntime().exec(new String[]{browser, url});
            }
        }
    }
}
