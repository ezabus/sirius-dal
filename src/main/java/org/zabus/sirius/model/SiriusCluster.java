package org.zabus.sirius.model;

import java.util.Set;

/**
 * Created by user on 08.07.2015.
 */
public class SiriusCluster {
    private long siriusClusterID;
    private String clusterName;
    private String description;
    private boolean isMaster;
    private Set<Integer> operatedObjects;
    private String virtualIP;

    public SiriusCluster() {

    }

    public long getSiriusClusterID() {
        return siriusClusterID;
    }

    public void setSiriusClusterID(long siriusClusterID) {
        this.siriusClusterID = siriusClusterID;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMaster() {
        return isMaster;
    }

    public void setIsMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }

    public Set<Integer> getOperatedObjects() {
        return operatedObjects;
    }

    public void setOperatedObjects(Set<Integer> operatedObjects) {
        this.operatedObjects = operatedObjects;
    }

    public String getVirtualIP() {
        return virtualIP;
    }

    public void setVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
    }
}
