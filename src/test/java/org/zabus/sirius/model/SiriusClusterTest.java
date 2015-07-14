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
public class SiriusClusterTest {
    static EntityManager em;
    static int numberOfRecords;
    static final String selectQuery = "select cluster from SiriusCluster cluster";
    static SiriusCluster expectedRecord;
    @BeforeClass
    public static void setUp() {
        numberOfRecords = 3;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
        context.getEnvironment().setActiveProfiles("develop");
        context.refresh();
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        em = emf.createEntityManager();
        /*
         private long siriusClusterID;
        private String clusterName;
        private String description;
        private boolean isMaster;
         clusterName','description',TRUE ,'virtualIP',1*/
        expectedRecord = new SiriusCluster();
        expectedRecord.setClusterName("clusterName");
        expectedRecord.setDescription("description");
        expectedRecord.setIsMaster(true);
        expectedRecord.setVirtualIP("virtualIP");
    }

    SiriusCluster foundRecord;
    @Before
    public void setFoundRecord()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusCluster> query =  em.createQuery(selectQuery + " where cluster.siriusClusterID = 1", SiriusCluster.class);
        List<SiriusCluster> siriusServiceList = query.getResultList();
        foundRecord = siriusServiceList.get(0);
        em.getTransaction().commit();
    }

    @Test
    public void testParentCluster()
    {
        SiriusCluster parentCluster = foundRecord.getParentCluster();
        assertEquals(1,parentCluster.getSiriusClusterID());
    }

    @Test
    public void testChildClusters()
    {
        Collection<SiriusCluster> childClusters = foundRecord.getChildClusters();
        assertEquals(3, childClusters.size());
    }

    @Test
    public void testNumberOfRecords()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusCluster> query =  em.createQuery(selectQuery, SiriusCluster.class);
        List<SiriusCluster> methodList = query.getResultList();
        em.getTransaction().commit();
        assertEquals(numberOfRecords, methodList.size());
    }

    @Test
    public void testSetGetClusterName()
    {
        assertEquals("clusterName", expectedRecord.getClusterName());
    }

    @Test
    public void testClusterName()
    {
        assertEquals(expectedRecord.getClusterName(), foundRecord.getClusterName());
    }

    @Test
    public void testSetGetDescription()
    {
        assertEquals("description", expectedRecord.getDescription());
    }

    @Test
    public void testDescription()
    {
        assertEquals(expectedRecord.getDescription(), foundRecord.getDescription());
    }

    @Test
    public void testSetMaster()
    {
        assertEquals(true,expectedRecord.isMaster());
    }

    @Test
    public void testIsMaster()
    {
        assertEquals(expectedRecord.isMaster(), foundRecord.isMaster());
    }

    @Test
    public void testSetGetVirtualIP()
    {
        assertEquals("virtualIP", expectedRecord.getVirtualIP());
    }

    @Test
    public void testVirtualIP()
    {
        assertEquals(expectedRecord.getVirtualIP(), foundRecord.getVirtualIP());
    }
}
