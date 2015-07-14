package org.zabus.sirius.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;


/**
 * Created by user on 11.07.2015.
 */
public class SiriusServiceTest
{
    static EntityManager em;
    static int numberOfRecords;
    static final String selectQuery = "select service from SiriusService service";
    static SiriusService expectedRecord;
    @BeforeClass
    public static void setUp()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
        context.getEnvironment().setActiveProfiles("develop");
        context.refresh();
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        em = emf.createEntityManager();
        expectedRecord = new SiriusService();
        expectedRecord.setCategory("category");
        expectedRecord.setDescription("description");
        expectedRecord.setEndpoint("endpoint");
        expectedRecord.setEntityKeyword("entityKeyword");
        expectedRecord.setIsHardcoded(true);
        expectedRecord.setIsSecured(true);
        expectedRecord.setIsSiriusService(true);
        expectedRecord.setManagementObjectName("managementObjectName");
        expectedRecord.setServiceName("serviceName");
        numberOfRecords = 3;
    }

    SiriusService foundRecord;

    @Before
    public void setFoundRecord()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusService> query =  em.createQuery(selectQuery + " where service.siriusServiceID = 1", SiriusService.class);
        List<SiriusService> siriusServiceList = query.getResultList();
        foundRecord = siriusServiceList.get(0);
        em.getTransaction().commit();
    }
    

    @Test
    public void testNumberOfRecords()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusService> query =  em.createQuery(selectQuery, SiriusService.class);
        List<SiriusService> siriusServiceList = query.getResultList();
        assertEquals(numberOfRecords, siriusServiceList.size());
        em.getTransaction().commit();

    }

    @Test
    public void testChilds()
    {
        Collection<SiriusServiceMethod> methods =  foundRecord.getSiriusServiceMethods();
        assertEquals(2,methods.size());
    }

    @Test
    public void testSetGetCategory()
    {
        assertEquals("category", expectedRecord.getCategory());
    }

    @Test
    public void testCategory()
    {
        assertEquals(expectedRecord.getCategory(), foundRecord.getCategory());
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
    public void testSetGetEndpoint()
    {
        assertEquals("endpoint", expectedRecord.getEndpoint());
    }

    @Test
    public void testEndpoint()
    {
        assertEquals(expectedRecord.getEndpoint(), foundRecord.getEndpoint());
    }

    @Test
    public void testSetGetEntityKeyword()
    {
        assertEquals("entityKeyword", expectedRecord.getEntityKeyword());
    }

    @Test
    public void testEntityKeyword()
    {
        assertEquals(expectedRecord.getEntityKeyword(), foundRecord.getEntityKeyword());
    }

    @Test
    public void testSetGetIsHardcoded()
    {
        assertEquals(true, expectedRecord.isHardcoded());
    }

    @Test
    public void testEntityIsHardcoded()
    {
        assertEquals(expectedRecord.isHardcoded(), foundRecord.isHardcoded());
    }

    @Test
    public void testSetGetIsSecured()
    {
        assertEquals(true, expectedRecord.isSecured());
    }

    @Test
    public void testEntityIsSecured()
    {
        assertEquals(expectedRecord.isSecured(), foundRecord.isSecured());
    }

    @Test
    public void testSetGetIsSiriusService()
    {
        assertEquals(true, expectedRecord.isSiriusService());
    }

    @Test
    public void testEntityIsSiriusService()
    {
        assertEquals(expectedRecord.isSiriusService(), foundRecord.isSiriusService());
    }

    @Test
    public void testSetGetManagementObjectName()
    {
        assertEquals("managementObjectName", expectedRecord.getManagementObjectName());
    }

    @Test
    public void testEntityManagementObjectName()
    {
        assertEquals(expectedRecord.getManagementObjectName(), foundRecord.getManagementObjectName());
    }

    @Test
    public void testSetGetServiceName()
    {
        assertEquals("serviceName", expectedRecord.getServiceName());
    }

    @Test
    public void testServiceName()
    {
        assertEquals(expectedRecord.getServiceName(), foundRecord.getServiceName());
    }
}
