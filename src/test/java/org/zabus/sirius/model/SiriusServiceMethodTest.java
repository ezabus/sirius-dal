package org.zabus.sirius.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zabus.sirius.dal.MethodRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by user on 11.07.2015.
 */
public class SiriusServiceMethodTest {
    static EntityManager em;
    static final String selectQuery = "select method from SiriusServiceMethod method";
    static SiriusServiceMethod expectedRecord;
    static int numberOfMethods;
    @BeforeClass
    public static void setUp()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/profiles.xml");
        context.getEnvironment().setActiveProfiles("test");
        context.refresh();
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        em = emf.createEntityManager();
        numberOfMethods = 5;
        expectedRecord = new SiriusServiceMethod();
        expectedRecord.setDescription("method");
        expectedRecord.setManagementObjectName("objectName");
        expectedRecord.setServiceKeyword("keyword");
        expectedRecord.setSiriusServiceMethodName("methodName");
                //'method', 'objectName', 'keyword','methodName',1
    }

    SiriusServiceMethod foundMethod;

    @Before
    public void setFoundMethod()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusServiceMethod> query =  em.createQuery(selectQuery +
                " where method.siriusServiceMethodID = 1", SiriusServiceMethod.class);
        List<SiriusServiceMethod> siriusMethodList = query.getResultList();
        foundMethod = siriusMethodList.get(0);
        em.getTransaction().commit();

}

    @Test
    public void testNumberOfRecords()
    {
        em.getTransaction().begin();
        TypedQuery<SiriusServiceMethod> query =  em.createQuery(selectQuery, SiriusServiceMethod.class);
        List<SiriusServiceMethod> methodList = query.getResultList();
        assertEquals(numberOfMethods, methodList.size());
        em.getTransaction().commit();
    }

    @Test
    public void testSetGetDescription()
    {
        assertEquals("method", expectedRecord.getDescription());
    }

    @Test
    public void testDescription()
    {
        assertEquals(expectedRecord.getDescription(), foundMethod.getDescription());
    }

    @Test
    public void testSetGetManagementObject()
    {
        assertEquals("objectName", expectedRecord.getManagementObjectName());
    }

    @Test
    public void testManagementObject()
    {
        assertEquals(expectedRecord.getManagementObjectName(),foundMethod.getManagementObjectName());
    }

    @Test
    public void testSetGetManagementObjectName()
    {
        assertEquals("keyword", expectedRecord.getServiceKeyword());
    }

    @Test
    public void testServiceKeyword()
    {
        assertEquals(expectedRecord.getServiceKeyword(),foundMethod.getServiceKeyword());
    }

    @Test
    public void testSetGetSiriusServiceMethodName()
    {
        assertEquals("methodName", expectedRecord.getSiriusServiceMethodName());
    }

    @Test
    public void testSiriusServiceMethodName()
    {
        assertEquals(expectedRecord.getSiriusServiceMethodName(),foundMethod.getSiriusServiceMethodName());
    }

}
