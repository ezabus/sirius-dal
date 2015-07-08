package org.zabus.sirius.model;

/**
 * Created by user on 08.07.2015.
 */
public class SiriusServer {
    private long siriusServerID;
    private String description;
    private String realIP;
    private String serverName;

    public SiriusServer() {

    }

    public long getSiriusServerID() {
        return siriusServerID;
    }

    public void setSiriusServerID(long siriusServerID) {
        this.siriusServerID = siriusServerID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRealIP() {
        return realIP;
    }

    public void setRealIP(String realIP) {
        this.realIP = realIP;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
