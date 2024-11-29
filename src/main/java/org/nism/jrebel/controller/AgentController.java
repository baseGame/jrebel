package org.nism.jrebel.controller;

import org.nism.jrebel.core.E;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Produces;
import org.noear.solon.boot.web.ContextBase;
import org.noear.solon.boot.web.MimeType;

import java.io.IOException;

/**
 * AgentController
 *
 * @author inism
 */
@Controller
@Mapping("/agent")
public class AgentController {

    @Inject
    private JrebelController jrebelController;

    @Mapping("/leases")
    @Produces(MimeType.APPLICATION_JSON_UTF8_VALUE)
    public E leases(ContextBase ctx, String randomness, String username, String guid, boolean offline, Long clientTime) throws IOException {
        return jrebelController.leases(ctx, randomness, username, guid, offline, clientTime);
    }

    @Mapping("/leases/1")
    @Produces(MimeType.APPLICATION_JSON_UTF8_VALUE)
    public E leases1(String username) {
        return jrebelController.leases1(username);
    }
}
