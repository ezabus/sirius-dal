package org.zabus.sirius.model;

import org.hibernate.annotations.Type;
import org.zabus.sirius.mock.TransportType;
import javax.persistence.*;

@Entity
public class SiriusServiceMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long siriusServiceMethodID;
    private String description;
    private String managementObjectName;
    private String serviceKeyword;
    private String siriusServiceMethodName;
    private TransportType transport;
    @ManyToOne
    @JoinColumn(name = "siriusServiceID")
    private SiriusService siriusService;

    public SiriusServiceMethod(String description, String managementObjectName, String serviceKeyword, String siriusServiceMethodName, TransportType transport, SiriusService siriusService) {
        this.description = description;
        this.managementObjectName = managementObjectName;
        this.serviceKeyword = serviceKeyword;
        this.siriusServiceMethodName = siriusServiceMethodName;
        this.transport = transport;
        this.siriusService = siriusService;
    }

    public SiriusServiceMethod() {

    }

    public void setSiriusService(SiriusService siriusService)
    {
        this.siriusService = siriusService;
    }

    public SiriusService getSiriusService()
    {
        return siriusService;
    }

    public long getSiriusServiceMethodID() {
        return siriusServiceMethodID;
    }

    public void setSiriusServiceMethodID(long siriusServiceMethodID) {
        this.siriusServiceMethodID = siriusServiceMethodID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManagementObjectName() {
        return managementObjectName;
    }

    public void setManagementObjectName(String managementObjectName) {
        this.managementObjectName = managementObjectName;
    }

    public String getServiceKeyword() {
        return serviceKeyword;
    }

    public void setServiceKeyword(String serviceKeyword) {
        this.serviceKeyword = serviceKeyword;
    }

    public String getSiriusServiceMethodName() {
        return siriusServiceMethodName;
    }

    public void setSiriusServiceMethodName(String siriusServiceMethodName) {
        this.siriusServiceMethodName = siriusServiceMethodName;
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
        return siriusServiceMethodID + " " + description + " " + managementObjectName + " " + serviceKeyword  + " " +
                siriusServiceMethodName;
    }
}