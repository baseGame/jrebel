package org.nism.jrebel.core;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author inism
 */
public final class C {

    private C() {
        throw new IllegalStateException();
    }

    public static final Charset UTF8 = StandardCharsets.UTF_8;
    public static final String CONTENT_TYPE_HTML = "text/html; charset=utf-8";

    public static final int ID = 1;
    public static final int LICENSE_TYPE = 1;
    public static final boolean EVALUATION_LICENSE = false;
    public static final String SERVER_VERSION = "3.2.4";
    public static final String SERVER_PROTOCOL_VERSION = "1.1";
    public static final String SERVER_GUID = "a1b4aea8-b031-4302-b602-670a990272cb";
    public static final String GROUP_TYPE = "managed";
    public static final String STATUS_CODE = "SUCCESS";
    public static final String MSG = null;
    public static final String STATUS_MESSAGE = null;

    public static final String SIGNATURE = "OJE9wGg2xncSb+VgnYT+9HGCFaLOk28tneMFhCbpVMKoC/Iq4LuaDKPirBjG4o394/UjCDGgTBpIrzcXNPdVxVr8PnQzpy7ZSToGO8wv/KIWZT9/ba7bDbA8/RZ4B37YkCeXhjaixpmoyz/CIZMnei4q7oWR7DYUOlOcEWDQhiY=";
    public static final String SERVER_RANDOMNESS = "H2ulzLlh7E0=";
    public static final String SEAT_POOL_TYPE = "standalone";
    public static final String COMPANY = "Administrator";
    public static final String ORDER_ID = "";
    public static final List<Object> ZERO_IDS = new ArrayList<>();
    public static final long LICENSE_VALID_FROM = 1490544001000L;
    public static final long LICENSE_VALID_UNTIL = 1691839999000L;

    public static BigInteger MODULUS = new BigInteger("9616540267013058477253762977293425063379243458473593816900454019721117570003248808113992652836857529658675570356835067184715201230519907361653795328462699");
    public static BigInteger PRIVATE_EXPONENT = new BigInteger("9616540267013058477253762977293425063379243458473593816900454019721117570003248808113992652836857529658675570356835067184715201230519907361653795328462699");
}
