package org.nism.jrebel.controller;

import org.nism.jrebel.core.C;
import org.nism.jrebel.core.E;
import org.nism.jrebel.core.S;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Produces;
import org.noear.solon.boot.web.ContextBase;
import org.noear.solon.boot.web.MimeType;

import java.io.IOException;

/**
 * JrebelController
 *
 * @author inism
 */
@Controller
@Mapping("/jrebel")
public class JrebelController {

    @Mapping("/leases")
    @Produces(MimeType.APPLICATION_JSON_UTF8_VALUE)
    public E leases(ContextBase ctx, String randomness, String username, String guid, boolean offline, Long clientTime) throws IOException {
        if (randomness == null || username == null || guid == null) {
            ctx.status(403);
            return null;
        }

        long validFrom = 0L;
        long validUntil = 0L;
        if (offline) {
            validFrom = clientTime;
            validUntil = validFrom + 180 * 24 * 60 * 60 * 1000L;
        }
        E e = new E();
        e.setServerVersion(C.SERVER_VERSION);
        e.setServerProtocolVersion(C.SERVER_PROTOCOL_VERSION);
        e.setServerGuid(C.SERVER_GUID);
        e.setGroupType(C.GROUP_TYPE);
        e.setId(C.ID);
        e.setLicenseType(C.LICENSE_TYPE);
        e.setEvaluationLicense(C.EVALUATION_LICENSE);
        e.setSignature(C.SIGNATURE);
        e.setServerRandomness(C.SERVER_RANDOMNESS);
        e.setSeatPoolType(C.SEAT_POOL_TYPE);
        e.setStatusCode(C.STATUS_CODE);
        e.setOffline(offline);
        e.setValidFrom(validFrom);
        e.setValidUntil(validUntil);
        e.setCompany(C.COMPANY);
        e.setOrderId(C.ORDER_ID);
        e.setZeroIds(C.ZERO_IDS);
        e.setLicenseValidFrom(C.LICENSE_VALID_FROM);
        e.setLicenseValidUntil(C.LICENSE_VALID_UNTIL);
        String signature = S.getSignature(randomness, guid, offline, validFrom, validUntil);
        e.setSignature(signature);
        e.setCompany(username);
        return e;
    }

    @Mapping("/leases/1")
    @Produces(MimeType.APPLICATION_JSON_UTF8_VALUE)
    public E leases1(String username) {
        E e = new E();
        e.setServerVersion(C.SERVER_VERSION);
        e.setServerProtocolVersion(C.SERVER_PROTOCOL_VERSION);
        e.setServerGuid(C.SERVER_GUID);
        e.setGroupType(C.GROUP_TYPE);
        e.setStatusCode(C.STATUS_CODE);
        e.setMsg(C.MSG);
        e.setStatusMessage(C.STATUS_MESSAGE);
        e.setCompany(username);
        return e;
    }

    @Mapping("/validate-connection")
    @Produces(MimeType.APPLICATION_JSON_UTF8_VALUE)
    public E validateConnection() {
        E e = new E();
        e.setServerVersion(C.SERVER_VERSION);
        e.setServerProtocolVersion(C.SERVER_PROTOCOL_VERSION);
        e.setServerGuid(C.SERVER_GUID);
        e.setGroupType(C.GROUP_TYPE);
        e.setLicenseType(C.LICENSE_TYPE);
        e.setEvaluationLicense(C.EVALUATION_LICENSE);
        e.setServerRandomness(C.SERVER_RANDOMNESS);
        e.setSeatPoolType(C.SEAT_POOL_TYPE);
        e.setStatusCode(C.STATUS_CODE);
        e.setCompany(C.COMPANY);
        return e;
    }
}
