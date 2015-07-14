package org.zabus.sirius.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by user on 08.07.2015.
 */
@Entity
public class SiriusCluster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long siriusClusterID;
    private String clusterName;
    private String description;
    private boolean isMaster;
    @ElementCollection
    private Set<Integer> operatedObjects;
    private String virtualIP;
    @ManyToMany(mappedBy="siriusClusters", fetch = FetchType.LAZY)
    private Set<SiriusServer> siriusServers;
    @ManyToOne
    @JoinColumn(name = "parentSiriusClusterID")
    private SiriusCluster parentCluster;
    @OneToMany(mappedBy = "parentCluster")
    private Collection<SiriusCluster> childClusters;

    public SiriusCluster() {
        siriusServers = new HashSet<SiriusServer>();
        childClusters = new LinkedList<SiriusCluster>();
    }

    public void setParentCluster(SiriusCluster parentCluster)
    {
        this.parentCluster = parentCluster;
    }

    public SiriusCluster getParentCluster()
    {
        return parentCluster;
    }

    public void setChildClusters(Collection<SiriusCluster> childClusters)
    {
        this.childClusters = childClusters;
    }

    public Collection<SiriusCluster> getChildClusters()
    {
        return childClusters;
    }

    public void setSiriusServers(Set<SiriusServer> siriusServers)
    {
        this.siriusServers = siriusServers;
    }

    public Set<SiriusServer> getSiriusServers()
    {
        return siriusServers;
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

    @Override
    public String toString()
    {
        return siriusClusterID + " " + clusterName + " " + description + " " + isMaster + " " + virtualIP;
    }
}
