package org.zabus.sirius.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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
    @OneToMany(mappedBy = "siriusServer", orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<SiriusService> siriusServices;
    @JoinTable
            (name="SERVER_CLUSTER",
                joinColumns = {
                        @JoinColumn(name = "siriusServerID", referencedColumnName = "siriusServerID")
                },
                inverseJoinColumns = {
                        @JoinColumn(name = "siriusClusterID", referencedColumnName = "siriusClusterID")
                }
            )
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<SiriusCluster> siriusClusters;

    public SiriusServer() {
        siriusClusters = new HashSet<SiriusCluster>();
    }

    public void setSiriusClusters(Set<SiriusCluster> siriusClusters)
    {
        this.siriusClusters = siriusClusters;
    }

    public Set<SiriusCluster> getSiriusClusters()
    {
        return siriusClusters;
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

    @Override
    public String toString()
    {
      return siriusServerID + " " + description + " " + serverName + " " + realIP;
    }
}
