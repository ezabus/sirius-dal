package org.zabus.sirius.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by user on 08.07.2015.
 */
@Entity
public class SiriusServer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
