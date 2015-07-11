package org.zabus.sirius.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zabus.sirius.dal.MethodRepository;

import java.util.List;

/**
 * Created by user on 11.07.2015.
 */
public class SiriusServiceMethodTest {
    static MethodRepository methodRepository;
    static SiriusServiceMethod record;
    static int numberOfMethods;
    @BeforeClass
    public static void setUp()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/profiles.xml");
        context.getEnvironment().setActiveProfiles("test");
        context.refresh();
        System.out.println("Prepare");
        methodRepository = (MethodRepository) context.getBean("methodRepository");
        numberOfMethods = 5;
        record = new SiriusServiceMethod();
        record.setDescription("method");
        record.setManagementObjectName("objectName");
        record.setServiceKeyword("keyword");
        record.setSiriusServiceMethodName("methodName");
                //'method', 'objectName', 'keyword','methodName',1
    }

    @Test
    public void testNumberOfRecords()
    {
        List<SiriusServiceMethod> methodList = (List<SiriusServiceMethod>) methodRepository.findAll();
        assertEquals(numberOfMethods,methodList.size());
    }

    @Test
    public void testSetGetDescription()
    {
        assertEquals("method",record.getDescription());
        List<SiriusServiceMethod> methodList = (List<SiriusServiceMethod>) methodRepository.findAll();
        assertEquals(numberOfMethods,methodList.size());
    }

    @Test
    public void testDescription()
    {
        SiriusServiceMethod siriusServiceMethod = methodRepository.findOne(1L);
        assertEquals(record.getDescription(),siriusServiceMethod.getDescription());

        List<SiriusServiceMethod> methodList = (List<SiriusServiceMethod>) methodRepository.findAll();
        assertEquals(numberOfMethods,methodList.size());
    }

    @Test
    public void testSetGetManagementObject()
    {
        assertEquals("objectName",record.getManagementObjectName());
    }

    @Test
    public void testManagementObject()
    {
        SiriusServiceMethod siriusServiceMethod = methodRepository.findOne(1L);
        assertEquals(record.getManagementObjectName(),siriusServiceMethod.getManagementObjectName());

        List<SiriusServiceMethod> methodList = (List<SiriusServiceMethod>) methodRepository.findAll();
        assertEquals(numberOfMethods,methodList.size());
    }

    @Test
    public void testSetGetManagementObjectName()
    {
        assertEquals("keyword",record.getServiceKeyword());
    }

    @Test
    public void testServiceKeyword()
    {
        SiriusServiceMethod siriusServiceMethod = methodRepository.findOne(1L);
        assertEquals(record.getServiceKeyword(),siriusServiceMethod.getServiceKeyword());
    }

    @Test
    public void testSetGetSiriusServiceMethodName()
    {
        assertEquals("methodName",record.getSiriusServiceMethodName());
    }

    @Test
    public void testSiriusServiceMethodName()
    {
        SiriusServiceMethod siriusServiceMethod = methodRepository.findOne(1L);
        assertEquals(record.getSiriusServiceMethodName(),siriusServiceMethod.getSiriusServiceMethodName());
    }

}
