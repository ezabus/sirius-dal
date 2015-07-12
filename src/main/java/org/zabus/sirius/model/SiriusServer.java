package org.zabus.sirius.model;

import javax.persistence.*;
import java.util.Collection;

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
    @OneToMany(mappedBy = "siriusServer", orphanRemoval = true, fetch = FetchType.EAGER)
    private Collection<SiriusService> siriusServices;

    public SiriusServer() {

    }

    public void setSiriusServices(Collection<SiriusService> siriusServices)
    {
        this.siriusServices = siriusServices;
    }

    public Collection<SiriusService> getSiriusServices()
    {
        return siriusServices;
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
