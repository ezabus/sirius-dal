package org.zabus.sirius.model;

import org.zabus.sirius.mock.ServiceResourceType;
import org.zabus.sirius.mock.SiriusServiceType;
import org.zabus.sirius.mock.TransportType;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 08.07.2015.
 */
@Entity
public class SiriusService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long siriusServiceID;
    private String category;
    private String description;
    private String endpoint;
    private String entityKeyword;
    private boolean isHardcoded;
    private boolean isSecured;
    private boolean isSiriusService;
    private String managementObjectName;
    private ServiceResourceType resourceType;
    private String serviceName;
    private SiriusServiceType siriusServiceType;
    private TransportType transport;
    @ManyToOne
    @JoinColumn(name = "siriusServerID")
    private SiriusServer siriusServer;
    @OneToMany(mappedBy = "siriusService", orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<SiriusServiceMethod> siriusServiceMethods;

    public SiriusService() {
        siriusServiceMethods = new LinkedList<SiriusServiceMethod>();
    }

    public void setSiriusServiceMethods(Collection<SiriusServiceMethod> siriusServiceMethods)
    {
        this.siriusServiceMethods = new LinkedList<SiriusServiceMethod>(siriusServiceMethods);
    }

    public  Collection<SiriusServiceMethod> getSiriusServiceMethods()
    {
        return  siriusServiceMethods;
    }

    public long getSiriusServiceID() {
        return siriusServiceID;
    }

    public void setSiriusServiceID(long siriusServiceID) {
        this.siriusServiceID = siriusServiceID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEntityKeyword() {
        return entityKeyword;
    }

    public void setEntityKeyword(String entityKeyword) {
        this.entityKeyword = entityKeyword;
    }

    public boolean isHardcoded() {
        return isHardcoded;
    }

    public void setIsHardcoded(boolean isHardcoded) {
        this.isHardcoded = isHardcoded;
    }

    public boolean isSecured() {
        return isSecured;
    }

    public void setIsSecured(boolean isSecured) {
        this.isSecured = isSecured;
    }

    public boolean isSiriusService() {
        return isSiriusService;
    }

    public void setIsSiriusService(boolean isSiriusService) {
        this.isSiriusService = isSiriusService;
    }

    public String getManagementObjectName() {
        return managementObjectName;
    }

    public void setManagementObjectName(String managementObjectName) {
        this.managementObjectName = managementObjectName;
    }

    public ServiceResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ServiceResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public SiriusServiceType getSiriusServiceType() {
        return siriusServiceType;
    }

    public void setSiriusServiceType(SiriusServiceType siriusServiceType) {
        this.siriusServiceType = siriusServiceType;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    @Override
    public String toString()
    {
        return siriusServiceID + " " + category + " " + description + " " + endpoint + " " + entityKeyword +
                " " + isHardcoded + " " + isSecured + " " + isSiriusService + " " + managementObjectName + " " + serviceName;
    }

}
