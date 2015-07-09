package org.zabus.sirius.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zabus.sirius.mock.TransportType;
import org.zabus.sirius.model.SiriusServiceMethod;
import java.util.List;

/**
 * Created by user on 07.07.2015.
 * Hello
 */
public class Main {
    public static void main(String args[])
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring/config.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/profiles.xml");
        context.getEnvironment().setActiveProfiles("test");
        context.refresh();
        Service service = (Service) context.getBean("service");

        SiriusServiceMethod ssm = new SiriusServiceMethod();
        ssm.setDescription("decripition");
        ssm.setManagementObjectName("management object name");
        ssm.setServiceKeyword("service keyword");
        ssm.setSiriusServiceMethodName("service method name");
        ssm.setTransport(new TransportType());

        service.save(ssm);

        List<SiriusServiceMethod> ssmList = (List) service.findAll();
        for(SiriusServiceMethod s : ssmList)
        {
            System.out.println(s.getSiriusServiceMethodName());
        }

    }
}
