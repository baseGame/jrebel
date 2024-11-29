package org.nism.jrebel.controller;

import org.nism.jrebel.core.C;
import org.nism.jrebel.utils.RsaUtil;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Produces;
import org.noear.solon.boot.web.ContextBase;

/**
 * RpcController
 *
 * @author inism
 */
@Controller
@Mapping("/rpc")
public class RpcController {

    @Mapping("/ping.action")
    @Produces(C.CONTENT_TYPE_HTML)
    public String ping(ContextBase ctx, String salt) {
        if (salt == null) {
            ctx.status(403);
            return null;
        } else {
            String xmlContent = "<PingResponse><message></message><responseCode>OK</responseCode><salt>" + salt + "</salt></PingResponse>";
            String xmlSignature = RsaUtil.sign(xmlContent);
            return "<!-- " + xmlSignature + " -->\n" + xmlContent;
        }
    }

    @Mapping("/obtainTicket.action")
    @Produces(C.CONTENT_TYPE_HTML)
    public String obtainTicket(ContextBase ctx, String salt, String userName) {
        if (salt == null || userName == null) {
            ctx.status(403);
            return null;
        } else {
            String xmlContent = "<ObtainTicketResponse><message></message><prolongationPeriod>607875500</prolongationPeriod><responseCode>OK</responseCode><salt>" + salt + "</salt><ticketId>1</ticketId><ticketProperties>licensee=" + userName + "\tlicenseType=0\t</ticketProperties></ObtainTicketResponse>";
            String xmlSignature = RsaUtil.sign(xmlContent);
            return "<!-- " + xmlSignature + " -->\n" + xmlContent;
        }
    }

    @Mapping("/releaseTicket.action")
    @Produces(C.CONTENT_TYPE_HTML)
    public String releaseTicket(ContextBase ctx, String salt) {
        if (salt == null) {
            ctx.status(403);
            return null;
        } else {
            String xmlContent = "<ReleaseTicketResponse><message></message><responseCode>OK</responseCode><salt>" + salt + "</salt></ReleaseTicketResponse>";
            String xmlSignature = RsaUtil.sign(xmlContent);
            return "<!-- " + xmlSignature + " -->\n" + xmlContent;
        }
    }
}
