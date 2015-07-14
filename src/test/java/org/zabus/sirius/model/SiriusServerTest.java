package org.zabus.sirius.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2015.
 */
public class SiriusServerTest {
    static EntityManager em;
    static int numberOfRecords;
    static final String selectQuery = "select server from SiriusServer server";
    static SiriusServer expectedRecord;
    @BeforeClass
    public static void setUp() {
        numberOfRecords = 5;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/profiles.xml");
        context.getEnvironment().setActiveProfiles("test");
        context.refresh();
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        em = emf.createEntityManager();
        /*
        private long siriusServerID;
        private String description;
        private String realIP;
        private String serverName;
         'description1','100.100.100.1','serverName1'*/
        expectedRecord = new SiriusServer();
        expectedRecord.setDescription("description1");
        expectedRecord.setRealIP("100.100.100.1");
        expectedRecord.setServerName("serverName1");
    }

    SiriusServer foundRecord;
    @Before
    public void setFoundRecord()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusServer> query =  em.createQuery(selectQuery + " where server.siriusServerID = 1", SiriusServer.class);
        List<SiriusServer> siriusServiceList = query.getResultList();
        foundRecord = siriusServiceList.get(0);
        em.getTransaction().commit();
    }

    @Test
    public void testNumberOfRecords()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusServer> query =  em.createQuery(selectQuery, SiriusServer.class);
        List<SiriusServer> methodList = query.getResultList();
        assertEquals(numberOfRecords, methodList.size());
        em.getTransaction().commit();
    }

    @Test
    public void testServices()
    {
        Collection<SiriusService> methods =  foundRecord.getSiriusServices();
        assertEquals(2,methods.size());
    }

    @Test
    public void testClusters()
    {
        Collection<SiriusCluster> methods =  foundRecord.getSiriusClusters();
        assertEquals(2,methods.size());
    }

    @Test
    public void testSetGetDescription()
    {
        assertEquals("description1", expectedRecord.getDescription());
    }

    @Test
    public void testDescription()
    {
        assertEquals(expectedRecord.getDescription(), foundRecord.getDescription());
    }

    @Test
    public void testSetGetRealIP()
    {
        assertEquals("100.100.100.1", expectedRecord.getRealIP());
    }

    @Test
    public void testRealIP()
    {
        assertEquals(expectedRecord.getRealIP(), foundRecord.getRealIP());
    }

    @Test
    public void testSetServerName()
    {
        assertEquals("serverName1", expectedRecord.getServerName());
    }

    @Test
    public void testServerName()
    {
        assertEquals(expectedRecord.getServerName(), foundRecord.getServerName());
    }

}
