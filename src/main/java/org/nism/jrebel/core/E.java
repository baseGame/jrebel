package org.nism.jrebel.core;

import java.io.Serializable;
import java.util.List;

/**
 * @author inism
 */
public class E implements Serializable {

    private long id;
    private long licenseType;
    private boolean evaluationLicense;
    private String serverVersion;
    private String serverProtocolVersion;
    private String serverGuid;
    private String groupType;
    private String statusCode;
    private String msg;
    private String statusMessage;

    private String signature;
    private String serverRandomness;
    private String seatPoolType;
    private boolean offline;
    private long validFrom;
    private long validUntil;
    private String company;
    private String orderId;
    private List<Object> zeroIds;
    private long licenseValidFrom;
    private long licenseValidUntil;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(long licenseType) {
        this.licenseType = licenseType;
    }

    public boolean isEvaluationLicense() {
        return evaluationLicense;
    }

    public void setEvaluationLicense(boolean evaluationLicense) {
        this.evaluationLicense = evaluationLicense;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getServerProtocolVersion() {
        return serverProtocolVersion;
    }

    public void setServerProtocolVersion(String serverProtocolVersion) {
        this.serverProtocolVersion = serverProtocolVersion;
    }

    public String getServerGuid() {
        return serverGuid;
    }

    public void setServerGuid(String serverGuid) {
        this.serverGuid = serverGuid;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getServerRandomness() {
        return serverRandomness;
    }

    public void setServerRandomness(String serverRandomness) {
        this.serverRandomness = serverRandomness;
    }

    public String getSeatPoolType() {
        return seatPoolType;
    }

    public void setSeatPoolType(String seatPoolType) {
        this.seatPoolType = seatPoolType;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public long getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(long validFrom) {
        this.validFrom = validFrom;
    }

    public long getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(long validUntil) {
        this.validUntil = validUntil;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Object> getZeroIds() {
        return zeroIds;
    }

    public void setZeroIds(List<Object> zeroIds) {
        this.zeroIds = zeroIds;
    }

    public long getLicenseValidFrom() {
        return licenseValidFrom;
    }

    public void setLicenseValidFrom(long licenseValidFrom) {
        this.licenseValidFrom = licenseValidFrom;
    }

    public long getLicenseValidUntil() {
        return licenseValidUntil;
    }

    public void setLicenseValidUntil(long licenseValidUntil) {
        this.licenseValidUntil = licenseValidUntil;
    }
}
